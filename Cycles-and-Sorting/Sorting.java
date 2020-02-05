import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Put length of Array: \n");
        int len = in.nextInt();

        //создается рандомный массив и выводится в консоль
        System.out.print("Random Array: \n");
        int ar[] = new int[len];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 10);
            System.out.print(ar[i] + " ");
        }

        //вызываю метод сортировки
        ar = sortChoosingMin(ar);

        //вывожу отсортированный массив
        System.out.println("\nSort Array:" );
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
        public static int[] sortChoosingMin(int[] ar) {
            int indexMin = 0;
            int min = ar[0];

            for (int i = 0; i < ar.length; i++) {
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
    }
