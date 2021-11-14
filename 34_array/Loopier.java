public class Loopier {
    public static int[] filler(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.pow(2.0, 31.0) * (double) Math.random());// * Math.pow(-1, Math.round(Math.random()))
        }
        return array;
    }

    public static String[] stringify(int[] array) {
        String result = "";
        for(int i : array) {
            result += i + ",";
        }
        return result;
    }

    public static int linSearch(int[] array, int target) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    } 

    public static int linSearchR(int[] array, int target) {
        /*if (array.length == 1) {
            if (array[0] != target) {
                return -1;
            } else {
                return 1;
            }
        } else {
            if (array[0] == target) {
                return 1;
            } else {
                return 1 + linSearchR(array[1::array.length]);
            }
        }  ^^ doesn't work*/
        return -1;
    } 

    public static int freq(int[] array, int target) {
        int total = 0;
        for (int i : array) {
            if (i == target) {
                total += 1;
            }
        }
        return total;
    }

    public static int freqRec(int[] array, int target) {
        String stringedArray = stringify(array);
        
        return 0;
    }
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] filledArray = filler(array);
        for (int i : filledArray) {
            System.out.print(i + ", ");
        }
        System.out.println("");
        String[] stringedArray = stringify(array);
        for (String i : stringedArray) {
            System.out.print(i + ", ");
        }
    }
}
