/***
    Jacc & David Chen & Kosta Dubovskiy
    APCS
    HW25 -- while loops cont., recursion, and fences
    2021-10-26
    time spent: .5
***/

public class Repeater {
    public static void main(String[] args ) {
        System.out.println(fenceW(1));
        System.out.println(fenceW(2));
        System.out.println(fenceW(3));
        System.out.println(fenceR(1));
        System.out.println(fenceR(2));
        System.out.println(fenceR(3));
    }

    public static String fenceW(int numPosts) {
        String result = "|";
        int counter = 1;
        while (counter < numPosts) {
            result += "--|";
            counter += 1;
        }
        return result;
    }

    public static String fenceR(int numPosts) {
        if (numPosts == 1) {
            return "|";
        } else {
            return fenceR(numPosts-1) + "--|";
        }
    }
}
