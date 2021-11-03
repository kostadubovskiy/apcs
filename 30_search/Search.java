public class Search {
    public static void main(String[] args) {

    }

    public static int searchString(String str, char c) {
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i, i + 1) == c) {
                index = i;
            }
        }

        return index;
    }
}
