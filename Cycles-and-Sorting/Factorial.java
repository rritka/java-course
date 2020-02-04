import java.util.Scanner;

public class Factorial {

    public static long factorial (int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("put your integer number: ");
        int number = in.nextInt();
        long result = factorial(number);

        System.out.printf("%d! = %d", number, result);
    }
}
