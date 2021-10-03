/* 
Kosta Dubovskiy
APCS
HW05 -- How was your summer?
2021-09-28
*/

import java.util.Arrays;

public class Loops {
    public static double power(double x, int n) {
        double running_total = x;
        for (int i = 1; i < n; i += 1) {
            running_total *= x;
        }
        return running_total;
    }
    public static double factorial(int n) {
        double running_total = 1;
        for (int i = 1; i <= n; i += 1) {
            running_total *= i;
        }
        return running_total;
    }
    public static double myexp(double x, double n) {
        double running_total = 1;
        for (int i = 1; i <= n; i += 1) {
            running_total += power(x, i)/factorial(i);
        }
        return running_total;
    }
    public static double myexpB(double x, double n) {
        double running_total = 1;
        double last_term = 1;
        for (int i = 1; i <= n; i += 1) {
            running_total += last_term * x / i;
            last_term *= x / i;
        }
        return running_total;
    }
    public static double[] check(double x) {
        double[] n = new double[3];
        n[0] = x;
        n[1] = myexpB(x, 100);
        n[2] = Math.exp(x);
        return n;
    }
    public static void main(String args[]) {
        System.out.println(power(5, 5));
        System.out.println(factorial(5));
        System.out.println(myexp(2, 3));
        System.out.println(myexpB(2, 3));
        System.out.println(Arrays.toString(check(1)));
    }
}
