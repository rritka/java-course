package WarAndPeace;

public class EasySearch implements ISearchEngine {

    public int search(String[] text, String word) {
        int counter = 0;
        for (int i = 0; i < text.length; i++) {
            int j = 0;
            while (j < text[i].length()) {
                int step = text[i].indexOf(word, j);
                if ( step > -1) {
                    counter++;
                    j = step + 1;
                } else break;
            }
        }
        return counter;
    }

    @Override
    public int search() {
        return 0;
    }
}
