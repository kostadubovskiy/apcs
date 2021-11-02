public class Commafier {
    public static void main(String[] args) {
        System.out.println(commafyR(123817837));
        System.out.println(commafyR(1238));
        System.out.println(commafyR(123));
        System.out.println(commafyR(1));
        System.out.println(commafyF(123817837));
        System.out.println(commafyF(1238));
        System.out.println(commafyF(123));
        System.out.println(commafyF(1));
    }
    public static String commafyR(int n) {
        if (n < 1000) {
            return Integer.toString(n);
        }
        String num = Integer.toString(n);
        String left = num.substring(0, num.length() - 3);
        String right = num.substring(num.length() - 3, num.length());
        return commafyR(Integer.parseInt(left)) + "," + right;
    }

    public static String commafyF(int n) {
        String num = Integer.toString(n);  
        int length = num.length();
        String result = "";

        if (num.length() < 3) {
            return num;
        }
        
        for (int i = 1; i <= length; i++) {
            if (i % 3 == 0) {
                String right = num.substring(length - i, length - i + 3);
                result = right + "," + result;
                if (length - i < 3 && length - i > 0) {
                    String left = num.substring(0, length - i);
                    result = left + "," + result;
                }
            }
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }
}