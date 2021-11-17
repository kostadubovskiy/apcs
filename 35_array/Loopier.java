/*
Team BPK: Perry Huang, Ben Belotser, Kosta Dubovskiy
APCS
HW34 -- A Pirate’s Life for Me / Finding things in arrays / Using recursive and iterative methods to find integers in arrays. 
2021-11-14
time spent: 0.5 hours
DISCO


QCC

How do we create a variable that persists throughout recursion?

*/

public class Loopier {
    public static int[] filler(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.pow(2.0, 31.0) * (double) Math.random());// * Math.pow(-1, Math.round(Math.random()))
        }
        return array;
    }

    public static String[] stringify(int[] array) {
        String[] result = "";
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
      	if (array.length == 0) {
        	return -1;
        }
        if (array.length == 1) {
        	if (array[0] == target) {
          return 0;}
          else {
          return -1;}
        if (array[array.length - 1] == target) {
        return array.length - 1;
        }
        }
      	else {
//        linSearchR(array[array[arraylength - 1], target);
        }
  			
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

/*    public static int freqRec(int[] array, int target) {
      int total = 0;
      if (array.length == 0) {
        return 0;
      }
      if (array.length == 1) {
      	if (array[0] == target);
        total = 1;
        else total = 0; 
      }
    	else {
        if (array[array.length -1] == target);
        	total += 1;
        	freq req
      	
        */
      
      
//        String stringedArray = stringify(array);
        
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