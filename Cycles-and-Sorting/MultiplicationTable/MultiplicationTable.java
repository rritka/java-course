public class MultiplicationTable {

    int start;
    int last;

    public MultiplicationTable (int start, int last) {
        this.start = start;
        this.last = last;
    }

    public String tableCreation() {

        String[][] array = new String[last][last];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int k = start + j;
                int m = start + i;
                array[i][j] = (k + "*" + m + "=" + (k * m));
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return null;
    }


}
