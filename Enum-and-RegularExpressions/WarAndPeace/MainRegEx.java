package WarAndPeace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainRegEx {
    public static void main(String[] args) {
        String filePath = "/home/margarita/IdeaProjects/Enum-and-RegularExpressions/src/Война и мир.txt";
        String text = readAllBytesJava7(filePath);
        RegExSearch count = new RegExSearch();

        String wordSearch = "война(\\w*)";

        measureTime(() -> count.search(text, wordSearch));
        System.out.println("counter of the word \"" + wordSearch + "\" : " + count.search(text, wordSearch));

    }

    public static void measureTime(Runnable search){    //метод расчета времени выполнения поиска
        long start = System.currentTimeMillis();
        search.run();
        long delta = System.currentTimeMillis() - start;
        System.out.println("Running time: " + delta + " ms");
    }

    private static String readAllBytesJava7(String filePath) {
        String content = "";
        try {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return content;
    }

}

