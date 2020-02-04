public class MultiplicationTable {

    public static void main(String[] args) {

        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int k = 2 + j;
                int m = 2 + i;
                array[i][j] = (k + "*" + m + "=" + (k * m));
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
