import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.Collectors;

public class PassportArrayList {
    public static void main(String[] args) {

        ArrayList<String> passportID = new ArrayList<String>(1_000_000);

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
        System.out.println("Size of ArrayList : " + passportID.size());
        System.out.println("Time Add elements to ArrayList : " + delta + " ms\n");


//        long start1 = System.currentTimeMillis();
//        passportID.clear();
//        long delta1 = System.currentTimeMillis() - start1;
//        System.out.println("Size of ArrayList : " + passportID.size());
//        System.out.println("Time clear ArrayList : " + delta1 + " ms");


        Iterator<String> itr = passportID.iterator();
        long start1 = System.currentTimeMillis();
        while (itr.hasNext()) {
            String next = itr.next();
            itr.remove();
        }
        long delta1 = System.currentTimeMillis() - start1;
        System.out.println("Size of ArrayList : " + passportID.size());
        System.out.println("Time clear by iterator ArrayList : " + delta1 + " ms");

//        for (String el: passportID) {
//            System.out.println(el);
//        }

    }
}
