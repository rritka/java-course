import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.stream.Collectors;

public class PassportLinkedList {
    public static void main(String[] args) {

        LinkedList<String> passportID = new LinkedList<String>();

        String symbols = "abcdefghijklmnopqrstuvwxyz1234567890";
        Random random = new Random();
        String temp;


        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            temp = random.ints(14, 0, symbols.length())
                    .mapToObj(symbols::charAt)
                    .map(Object::toString)
                    .collect(Collectors.joining());

            passportID.add(temp);
        } long delta = System.currentTimeMillis() - start;
        System.out.println("Size of LinkedList : " + passportID.size());
        System.out.println("Time Add elements to LinkedList : " + delta + " ms\n");

        long start1 = System.currentTimeMillis();
        passportID.clear();
        long delta1 = System.currentTimeMillis() - start1;
        System.out.println("Size of LinkedList : " + passportID.size());
        System.out.println("Time clear LinkedList : " + delta1 + " ms");



//        for (String el: passportID) {
//            System.out.println(el);
//        }

    }
}
