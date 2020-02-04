import java.util.Objects;
import java.util.Scanner;

public class VasyaIf {

    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет, Вася! \n" + "Я тебя так долго ждал!");
        }
        if (Objects.equals(name, "Анастасия")) {
            System.out.println("Привет, Анастасия! \n" + "Я скучал!");
        }
        if (Objects.equals(name, "Илья")) {
            System.out.println("Привет, Ильюша! \n" + "Обожаю твою ямочку на щеке!");
        }

        if (Objects.equals(name, "Рита")) {
            System.out.println("Привет, Ритка - лиска! :)");
        }

        if (!Objects.equals(name, "Анастасия") && !Objects.equals(name, "Вася") &&
                !Objects.equals(name, "Илья") && !Objects.equals(name, "Рита")) {
            System.out.println("Добрый день, а вы кто?");
        }


    }
}
