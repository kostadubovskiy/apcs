/*
Team BPK: Ben Belotser, Perry Huang, Kosta Dubovskiy
APCS
HW37 -- PPMP[]/CodingBat Problem Solving/Coding to solve some array problems 
2021-11-16
time spent: 0.5 hours
*/

public class array1{

    /*Given an array of ints, return true if 6 appears as either the first or last element in the array.
     The array will be length 1 or more.*/
    
      public static boolean firstLast6(int[] nums) {
      return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }
    
    /*Given an array of ints, return true if the array is length 1 or more, and the first element and the
     last element are equal.*/
    
      public static boolean sameFirstLast(int[] nums) {
      return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }
    
    //Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    
      public static int[] makePi() {
      int[] array = {3, 1, 4};
      return array;
    }
    
    /*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the
      same last element. Both arrays will be length 1 or more.*/
    
      public static boolean commonEnd(int[] a, int[] b) {
      return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
    
    //Given an array of ints length 3, return the sum of all the elements.
    
      public static int sum3(int[] nums) {
      int result = 0;
      for (int i : nums) {
        result += i;
      }
      return result;
    }
    
    
    
    public static void main (String[] args) {
      int[] array = {1,2,6};
      System.out.println(firstLast6(array) + "," + sameFirstLast(array));
      int[] array2 = {6,1,2,3};
      System.out.println(firstLast6(array2) + "," + sameFirstLast(array2));
      int[] array3 = {13,6,1,2,3};
      System.out.println(firstLast6(array3) + "," + sameFirstLast(array3));
    
      System.out.println(makePi());
    
      int[] array4 = {1, 2, 3};
      int[] array5 = {7, 2, 3};
      int[] array6 = {8, 2, 1};
      int[] array7 = {0, 2, 4};
      System.out.println(commonEnd(array4, array5));
      System.out.println(commonEnd(array6, array7));
    
      System.out.println(sum3(array4));
      System.out.println(sum3(array5));
    }
    }
    