/*
Team BPK: Ben Belotser, Perry Huang, Kosta Dubovskiy
APCS
HW37 -- PPMP[]/CodingBat Problem Solving/Coding to solve some array problems 
2021-11-16
time spent: 0.5 hours
*/

public class array2 {

    /*Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder,
     e.g. 5 % 2 is 1.*/
    
    public static int countEvens(int[] nums) {
        int counter = 0;
        for ( int i : nums) {
            if (i%2 == 0) {
            counter++;
            }
        }
        return counter;
    }
    
    /*Given an array length 1 or more of ints, return the difference between the largest and smallest
      values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the
      smaller or larger of two values.*/
    
    public static int bigDiff(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
            smallest = Math.min(smallest, nums[i]);
        }
        return (largest - smallest);
    }      
        
    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4}; 
        int[] array2 = {2, 4, 2, 6, 4}; 
        int[] array3 = {2, 22, 2, 3, 9}; 
        System.out.println(countEvens(array1));
        System.out.println(countEvens(array2));
        System.out.println(countEvens(array3));
    
        System.out.println(bigDiff(array1));
        System.out.println(bigDiff(array2));
        System.out.println(bigDiff(array3));
        }
    }
    