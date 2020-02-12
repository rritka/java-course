import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Put length of Array: ");
        int len = in.nextInt();
        System.out.println("Do you want to fill array by yourself or use random? [y/n]");
        String bool = in.next();

        int ar[] = new int[len];

        if (bool.equals("y")) {
            System.out.println("nice choice, fill array by integer: ");
            for (int i = 0; i < ar.length; i++) {
                ar[i] = in.nextInt();
            } printArray(ar);
        } else if (bool.equals("n")){
            System.out.println("okay, I have created random array for you: ");
            for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 10);
            } printArray(ar);
        } else {
          System.out.println("Error");
          return;
        }

        System.out.println("\nChoose number of sorting\n 1 - Sort by choosing min\n 2 - Bubble sort\n 3 - Shake sort\n" +
                " 4 - Insert sort\n 5 - Merge sort\n 6 - Quick sort");

        int numberOfSort = in.nextInt();

        switch (numberOfSort){
            case 1 :
                System.out.println("\n---Sort by choosing min---");
                measureTime(() -> sortChoosingMin(ar));    //вызов метода сортировки выбором
                printArray(ar);
                break;
            case 2 :
                System.out.println("\n---Bubble sort---");
                measureTime(() -> sortBubble(ar));      //вызов метода сортировки пузырьком
                printArray(ar);
                break;
            case 3 :
                System.out.println("\n---Shake sort---");
                measureTime(() -> sortCocktail(ar));   //вызов метода сортировки шейкерной
                printArray(ar);
                break;
            case 4 :
                System.out.println("\n---Insert sort---");
                measureTime(() -> sortInsert(ar));       //вызов метода сортировки вставками
                printArray(ar);
                break;
            case 5 :
                System.out.println("\n---Merge sort---");
                measureTime(() -> sortMerge(ar));         //вызов метода сортировки слиянием
                printArray(ar);
                break;
            case 6 :
                System.out.println("\n---Quick sort---");
                measureTime(() -> sortQuick(ar));            //вызов метода быстрой сортировки
                printArray(ar);
                break;
        }
    }

    public static void measureTime(Runnable sort){    //метод расчета времени выполнения сортирки
        long start = System.currentTimeMillis();
        sort.run();
        long delta = System.currentTimeMillis() - start;
        System.out.println("Running time: " + delta + " ms");
    }

    public static void printArray (int[] array) {    //метод вывода массивa
        for (int a: array) {
            System.out.print(a + " ");
        };
    }

        public static int[] sortChoosingMin(int[] ar) { //сортировка вставками
            int indexMin = 0;
            int min = 0;
            for (int i = 0; i < ar.length; i++) {
                indexMin = i;
                min = ar[i];
                for (int j = i; j < ar.length; j++) {
                    if (ar[j] < min) {
                        min = ar[j];
                        indexMin = j;
                    }
                }
                ar[indexMin] = ar[i];
                ar[i] = min;
            }
            return ar;
        }

        public static int[] sortBubble(int[] ar) { // сортировка пузырьком
        int j = 1;
        int k = 0;
            do {
                j++;
                for (int i = 0; i < (ar.length - 1); i++) {
                    if (ar[i] > ar[i + 1]) {
                        k = ar[i];
                        ar[i] = ar[i + 1];
                        ar[i + 1] = k;
                    }
                }
            } while (1 <= (ar.length - j));
            return ar;
        }

        public static int[] sortCocktail(int[] ar) { // сортировка шейкерная
        int j = 0;
        int k = 0;
        while (j < (int)(ar.length)/2){
            for (int i = j; i < (ar.length - 1); i++) {
                if (ar[i] > ar[i + 1]) {
                    k = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = k;
                }
            }
                for (int l = (ar.length - 1); l > j; l--) {
                    if (ar[l] < ar[l-1]) {
                        k = ar[l];
                        ar[l] = ar[l-1];
                        ar[l-1] = k;
                    }
                }
            j++;
        }
        return ar;
    }

    public static int[] sortInsert(int[] ar) { // сортировка вставками
        int k = 0;
        for (int i = 1; i < ar.length; i++) {
            for (int j = i; j > 0 && ar[j-1] > ar[j] ; j--) {
                k = ar[j];
                ar[j] = ar[j-1];
                ar[j-1] = k;
            }
        }
        return ar;
        }

    public static int[] sortMerge (int[] ar) { //сортировка слиянием
        int[] tmp;
        int[] currentSrc = ar;
        int[] currentDest = new int[ar.length];

        int size = 1;
        while (size < ar.length) {
            for (int i = 0; i < ar.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, (i + size), currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;

        }
        return ar;
    }

    private static void merge(int[] a, int aStart, int[] b, int bStart, int[] dest,  // метод для слияния массивов
                              int destStart, int size) {
        int indexA = aStart;
        int indexB = bStart;

        int aEnd = Math.min(aStart + size, a.length);
        int bEnd = Math.min(bStart + size, b.length);

        int iterationCount = aEnd - aStart + bEnd - bStart;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (indexA < aEnd && (indexB >= bEnd || a[indexA] < b[indexB])) {
                dest[i] = a[indexA];
                indexA++;
            } else {
                dest[i] = b[indexB];
                indexB++;
            }
        }
    }

    public static int[] sortQuick(int[] ar) {  // сортировка разделением
        int start = 0;
        int end = ar.length - 1;
        doSort(ar, start, end);
        return ar;

    }

    private static void doSort(int array[], int start, int end) {  //рекурсивный метод сортировки разделением
        if (start >= end)
            return;
        int i = start;
        int j = end;
        int cur = i - (i - j) / 2;    // центральный элемент относительно которого сортируем
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(array, start, cur);
        doSort(array, (cur+1), end);
    }


}
