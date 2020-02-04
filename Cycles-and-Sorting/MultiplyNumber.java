import java.util.Scanner;

public class MultiplyNumber {   //вычисление произведения цифр введенного числа

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ильюша, put your integer number: ");
        int num = in.nextInt();

        int result = 1;
        while (num >= 1) {
            int i = num % 10;
            num = (num - i) / 10;
            result *= i;
            System.out.println("цифра числа: " + i + "  произведение с этой цифрой: " + result);
        }

    }
}
