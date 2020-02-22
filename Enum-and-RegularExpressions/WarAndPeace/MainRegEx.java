import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainRegEx {
    public static void main(String[] args) {
        String filePath = "/home/margarita/IdeaProjects/Enum-and-RegularExpressions/src/Война и мир.txt";
        //String filePath = "/home/margarita/IdeaProjects/Enum-and-RegularExpressions/src/test.txt";
        String text = readAllBytesJava7(filePath);
        RegExSearch count = new RegExSearch();

        String wordSearch = "война(\\w*)";

        System.out.println("counter of the word \"" + wordSearch + "\" : " + count.search(text, wordSearch));

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

