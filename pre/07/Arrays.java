/* 
Kosta Dubovskiy
APCS
HW05 -- How was your summer?
2021-09-28
*/

public class Arrays {
    // 1
    public static double[] powArray(double[] n, int p) {
        double[] result = new double[n.length];
        for (int i = 0; i <= n.length; i += 1) {
            result[i] = Math.pow(n[i], p);
        }
        return result;
    }
    public static double[] histogram(int[] n, int counters) {
        double[] result = new double[counters];
        for (int d : n) {
            result[d - 1] += 1;
        }
        return result;
    }
    // 4
    public static double indexOfMax(double[] n) {
        double max = n[0];
        double max_index = 0;
        int curr_index = 0;
        for (double x : n) {
            if (x > max) {
                max = x;
                max_index = curr_index;
            }
            curr_index += 1;
        }

        return max_index;
    }
    // 5
    public static boolean[] sieve(int n) {
        boolean[] result = new boolean[n];
        for (int init_elems = 0; init_elems < n; init_elems += 1) {
            result[init_elems] = true;
        }
        for (int i = 0; i < n; i += 1) {
            if (result[i] != false) {
                result[i] = true;
                for (int multiple = i; multiple < n; multiple += i) {
                    result[multiple] = false;
                }
                i += 1;
            } else {
                i += 1;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        double[] n = {5, 1, 2, 3, 6, 0, 1, 2};
        System.out.println(indexOfMax(n));
        System.out.println(sieve(6));
    }
}
