import java.util.Scanner;

public class MainMultiplicationTable {

    public static void main(String[] args) {
        System.out.println("Таблица умножения для Ильюши :)");
        Scanner in = new Scanner(System.in);
        System.out.println("С какого числа начать таблицу?");
        int start = in.nextInt();
        System.out.println("каким числом закончить таблицу?");
        int last = in.nextInt();

        String result = printTable(start, last);
    }

    private static String printTable(int start, int last) {
        MultiplicationTable myTable = new MultiplicationTable(start, last);
        return myTable.tableCreation();
    }

}









