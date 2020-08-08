import java.util.Arrays;

public class Main {
        public static void main(String[] args) {

            //input data without black    (answer must be 8)
//            int data[] = {1, -3, 2, -2, 3, 4};
//            int n = 6;
//            int k = -1;

            //input data with black   (answer must be 12)
            int data[] = {2, 3, 4, 5, -30, 6, -1, 2};
            int n = 8;
            int k = 2;

            int result = 0;

            if (k == -1) {
                result = gameNoBlack(data);
                System.out.println(result);
            } else if (k >= 0) {
                result = gameWithBlack(data, k);
                System.out.println(result);
            } else {
                System.out.println("error k < -1");
            }

        }


    public static int gameNoBlack(int[] data){
        //локальная сумма очков для одной итерации между красным и синим дротиком
        int sum = 0;

        //массив значений максимальных сумм от каждой секции
        int[] all_sum = new int[data.length];

        //нахождение максимальной суммы от каждой секции и запись в массив all_sum
        for (int i = 0; i < data.length; i++) {  // i - красная метка
            sum = data[i];
            int blue = i + 1;                    // blue - синяя метка
            do {
                if(blue == data.length) {   // проход по кругу массива, т.е если дошли до конца -
                    blue = 0;               //  - начать сначала, пока не дойдем до того же индекса(усл в while)
                }
                int buff = sum + data[blue];
                if (sum <= buff) {          //если сумма + следующее больше, то присваеваем новую сумму
                    sum = buff;
                } else {
                    all_sum[i] = sum;       //если нет, записываем значение и переставляем красную метку
                    break;
                }
                blue++;
            } while(blue != i + 1);
        }

        //выбор максимального значения из максимальных сумм от каждой секции
        int max = all_sum[0];
        for (int i = 0; i < all_sum.length; i++) {
            max = Math.max(all_sum[i],max);
        }
        return max;
    }



    public static int gameWithBlack(int[] data, int k){
        //локальная сумма очков для одной итерации между красным и синим дротиком
        int sum = 0;

        //массив значений максимальных сумм от каждой секции
        int[] all_sum = new int[data.length];

        //нахождение максимальной суммы от каждой секции и запись в массив all_sum
        for (int i = 0; i < data.length; i++) {  // i - красная метка

            int blue = i + 1;                    // blue - синяя метка

            if (i == k){
                sum = 0;
                all_sum[i] = sum;
            } else {
                sum = data[i];

                do {
                    if (blue == data.length) {   // проход по кругу массива, т.е если дошли до конца -
                        blue = 0;               //  - начать сначала, пока не дойдем до того же индекса(усл в while)
                    }
                    if (blue != k) {
                        int buff = sum + data[blue];
                        if (sum <= buff) {          //если сумма + следующее больше, то присваеваем новую сумму
                            sum = buff;
                        } else {
                            all_sum[i] = sum;       //если нет, записываем значение и переставляем красную метку
                            break;
                        }
                    } else {
                        sum = 0;
                        all_sum[i] = sum;       //если нет, записываем значение и переставляем красную метку
                        break;
                    }

                    blue++;
                } while (blue != i + 1);
            }
        }

        //выбор максимального значения из максимальных сумм от каждой секции
        int max = all_sum[0];
        for (int i = 0; i < all_sum.length; i++) {
            max = Math.max(all_sum[i],max);
        }
            return max;
    }

}


