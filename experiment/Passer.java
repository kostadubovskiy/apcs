public class Passer {
    public static void main(String[] args) {
        int v = 10;
        int tempV = v;
        v += 5;
        System.out.println(tempV); // returned 10

        String str = "abcd";
        String tempStr = str;
        str += "e";
        System.out.println(tempStr);
    }
}