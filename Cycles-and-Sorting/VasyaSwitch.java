import java.util.Scanner;

public class VasyaSwitch {

    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        switch (name) {
            case "Вася" :
                System.out.println("Привет, Вася! \n" + "Я тебя так долго ждал!");
                break;

            case "Анастасия" :
                System.out.println("Привет, Анастасия! \n" + "Я скучал!");
                break;

            case "Илья" :
                System.out.println("Привет, Ильюша! \n" + "Обожаю твою ямочку на щеке!");
                break;

            case "Рита" :
                System.out.println("Привет, Ритка - лиска! :)");
                break;

            default:
                System.out.println("Добрый день, а вы кто?");
        }


    }
}
