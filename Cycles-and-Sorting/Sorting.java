import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
/*
        Scanner in = new Scanner(System.in);
        System.out.print("Put length of Array: \n");
        int len = in.nextInt(); */
int len = 100_000;

       // System.out.print("Random Array: \n");    //создается рандомный массив и выводится в консоль
        int ar[] = new int[len];
        int ar1[] = new int[len];
        int ar2[] = new int[len];
        int ar3[] = new int[len];
        int ar4[] = new int[len];

        /*
        for (int i = 0; i < ar.length; i++) {
            ar[i] = ar1[i] = ar2[i] = ar3[i] = ar4[i] = (int) (Math.random() * 10);
          //  System.out.print(ar[i] + " ");
        } */

        System.out.println("Time of sort by choosing min");
        measureTime(() -> sortChoosingMin(ar));
        //ar = sortChoosingMin(ar);            //вызываю метод сортировки выбором

        System.out.println("Time of bubble sort");
        measureTime(() -> sortBubble(ar1));
        //ar1 = sortBubble(ar1);                 //вызываю метод сортировки пузырьком

        System.out.println("Time of Shake sort");
        measureTime(() -> sortCocktail(ar2));
        //ar2 = sortCocktail(ar2);                 //вызываю метод сортировки шейкерной

        System.out.println("Time of Insert sort");
        measureTime(() -> sortInsert(ar3));
        //ar3 = sortInsert(ar3);                 //вызываю метод сортировки вставками

        System.out.println("Time of Merge sort");
        measureTime(() -> sortMerge(ar4));
        //ar4 = sortMerge(ar4);                 //вызываю метод сортировки слиянием


       /*
        System.out.println("\nSort Array:" );     //вывод отсортированного массивa
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        } */
    }

    public static void measureTime(Runnable sort){    //метод расчета времени выполнения сортирки
        long start = System.currentTimeMillis();
        sort.run();
        long delta = System.currentTimeMillis() - start;
        System.out.println("Running time: " + delta + " ms\n");
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
        return currentSrc;
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


}
