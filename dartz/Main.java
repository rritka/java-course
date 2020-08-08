import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //input data without black    (answer must be 8)
//        int data[] = {1, -3, 2, -2, 3, 4};
//        int n = 6;
//        int k = -1;

        //input data with black   (answer must be 12)
            int data[] = {2, 3, 4, 5, -30, 6, -1, 2};
            int n = 8;
            int k = 2;

        int result = 0;

        if (k == -1) {
            result = gameNoBlack(data, n);
            System.out.println(result);
        } else if (k >= 0) {
                result = gameWithBlack(data, n, k);
            System.out.println(result);
        } else {
            System.out.println("error k < -1");
        }

    }


    public static int gameNoBlack(int[] data, int n) {

        //массив значений максимальных сумм от каждой секции
        int max = 0;

        //промежуточные суммы от синей метки до каждой секции
        int[] sum = new int[n];

        //максимальные значения от каждой секции
        int[] sum_of_max = new int[n];

        //нахождение максимальной суммы от каждой секции и запись в массив
        for (int i = 0; i < n-1; i++) {  // i - красная метка
            int blue = i + 1;                    // blue - синяя метка
            int j = 0;
            sum[j] = data[i];

            while (blue != i) {
                sum[j+1] = sum[j] + data[blue];
                if (blue == n-1) {        // проход по кругу массива, т.е если дошли до конца -
                    blue = 0;               //  - начать сначала, пока не дойдем до того же индекса(усл в while)
                } else blue++;
                j++;
            }
            //выбор максимального значения из сумм от каждой секции
            sum_of_max[i] = sum[0];
            for (int k = 0; k < n; k++) {
                sum_of_max[i] = Math.max(sum[k], sum_of_max[i]);
            }
        }

        //выбор максимального значения из максимальных сумм от каждой секции
        max = sum_of_max[0];
        for (int k = 0; k < n; k++) {
            max = Math.max(sum_of_max[k], max);

        }
        return max;
    }


    public static int gameWithBlack(int[] data, int n, int k) {

        //массив значений максимальных сумм от каждой секции
        int max = 0;

        //промежуточные суммы от синей метки до каждой секции
        int[] sum = new int[n];

        //максимальные значения от каждой секции
        int[] sum_of_max = new int[n];

        //нахождение максимальной суммы от каждой секции и запись в массив
        for (int i = 0; i < n-1; i++) {  // i - красная метка
            if (i == k) continue;
            int blue = i + 1;                    // blue - синяя метка
            int j = 0;
            sum[j] = data[i];

            while (blue != i) {
                if (blue == k){
                    sum[j+1] = 0;
                    break;
                }
                sum[j+1] = sum[j] + data[blue];
                if (blue == n-1) {        // проход по кругу массива, т.е если дошли до конца -
                    blue = 0;               //  - начать сначала, пока не дойдем до того же индекса(усл в while)
                } else blue++;
                j++;
            }
            //выбор максимального значения из сумм от каждой секции
            sum_of_max[i] = sum[0];
            for (int l = 0; l < n; l++) {
                sum_of_max[i] = Math.max(sum[l], sum_of_max[i]);
            }
        }

        //выбор максимального значения из максимальных сумм от каждой секции
        max = sum_of_max[0];
        for (int l = 0; l < n; l++) {
            max = Math.max(sum_of_max[l], max);

        }
        return max;
    }
}





