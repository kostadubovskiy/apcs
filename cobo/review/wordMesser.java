import java.util.ArrayList;

public class wordMesser {
        /**
     * Returns the ending punctuation of a string, or the empty string if there is
     * none
     */
    public static String getPunctuation(String word) {
        String punc = "";
        for (int i = word.length() - 1; i >= 0; i--) {
        if (!Character.isLetterOrDigit(word.charAt(i))) {
            punc = punc + word.charAt(i);
        } else {
            return punc;
        }
        }
        return punc;
    }

    /**
     * Returns the word after removing any beginning or ending punctuation
     */
    public static String removePunctuation(String word) {
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(0))) {
        word = word.substring(1);
        }
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length() - 1))) {
        word = word.substring(0, word.length() - 1);
        }

        return word;
    }

    public static String wordMess(String word) {
        if (removePunctuation(word).length() > 3) {
            word = word.substring(0, 3) + "w" + word.substring(4);
        }
        return word;
    }

    public static String sentMess(String sent) {
        int lastSpace = 0;
        sent += " ";
        String result = "";
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < sent.length(); ++i) {
            if (sent.substring(i, i + 1).equals(" ")) {
                words.add(sent.substring(lastSpace, i));
                lastSpace = i;
            }
        }
        for (String word : words) {
            word = wordMess(word);
            result += word;
        }
        words.set(0, " " + words.get(0));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sentMess("I enjoy ice cream!!"));
    }
}
