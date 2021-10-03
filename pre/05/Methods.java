/* 
Kosta Dubovskiy
APCS
HW05 -- How was your summer?
2021-09-28
*/

public class Methods {
    // 2
    public static boolean isDivisible (int n, int m) {
        boolean result;
        if (n % m == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    } 
    // 3
    public static boolean isTriangle (int a, int b, int c) {
        if (a + b < c) {
            return false;
        } else if (a + c < b) {
            return false;
        } else if (b + c < a) {
            return false;
        }
        return true;
    } 
    // 8
    public static double ack(double m, double n) {
        if (m == 0) {
            n += 1;
            return n;
        } else if (m > 0 && n == 0) {
            return ack(m - 1 , 1);
        } else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n-1));
        }
        return 0.00;
    }
    public static void main(String args[]) {
        System.out.println(ack(1, 2));
    }
}
