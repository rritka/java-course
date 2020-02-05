import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
/*
        Scanner in = new Scanner(System.in);
        System.out.print("Put length of Array: \n");
        int len = in.nextInt(); */
int len = 10;

        System.out.print("Random Array: \n");    //создается рандомный массив и выводится в консоль
        int ar[] = new int[len];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 10);
            System.out.print(ar[i] + " ");
        }

        //ar = sortChoosingMin(ar);            //вызываю метод сортировки выбором
        //ar = sortBubble(ar);                 //вызываю метод сортировки пузырьком
        //ar = sortCocktail(ar);                 //вызываю метод сортировки шейкерной
        ar = sortInsert(ar);                 //вызываю метод сортировки вставками

        System.out.println("\nSort Array:" );     //вывожу отсортированный массив
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
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
        int j = 1;
        int k = 0;
        while (j < (int)(ar.length)/2){
            j++;
            for (int i = 0; i < (ar.length - 1); i++) {
                if (ar[i] > ar[i + 1]) {
                    k = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = k;
                }
            }
                for (int l = (ar.length - 1); l > 0; l--) {
                    if (ar[l] < ar[l-1]) {
                        k = ar[l];
                        ar[l] = ar[l-1];
                        ar[l-1] = k;
                    }
                }
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

}
