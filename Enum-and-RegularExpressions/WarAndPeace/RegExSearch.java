package WarAndPeace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements  ISearchEngine {
    public int search(String text, String word) {
        int counter = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            counter ++;
        }
        return counter;
    }

    @Override
    public int search() {
        return 0;
    }
}
