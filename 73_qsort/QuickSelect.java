/**
 * Unicorn Unicodes: Eric, Lea, Kosta
 * APCS
 * HW72 -- Fast Select yth Smallest Value w/ Partitioning
 * 2022-03-08
 * time spent: .5 hours
 * 
 * ALGO: O(n^2)... not greart
 * BEST CASE SCENARIO: When the first pivot that we choose maps to the y-1th index after being partitioned
 * WORST CASE SCENARIO: When the array is in reverse order should be the worst case
 * DISCO: We believe that this algorithm assumes that all elements are unique, which may not be the case. This is because our linear search simply finds the first occurance of the value not all of them.
 * QCC: How can we fix the assumptiom above, and improve time efficiency??
 */
public class QuickSelect {
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o )
    {
        int tmp = o[x];
        o[x] = o[y];
        o[y] = tmp;
    }

    public static int find(int[] arr, int val) {
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] == val) { 
                return i;
            }
        }
        return -1;
    }

    //--------------^  HELPER METHODS  ^--------------
    /**
   * int partition(int[],int,int,int)
   * DESCRIP
   * This method takes in an input array, and it looks at the data chunk between the inputted start and end indices.
   * It then sorts that interval into two sections, left and right. Using the third input value, splitInd, it sets a special value.
   * This value is used as a comparison for all array values, if an array element is less than or equal then it goes into the left section of the array,
   * if however it is greater than the special value at the specifed index it will go in the right section. 
   * 
   * @param arr : input array
   * @param start : start index
   * @param end : end index
   * @param splitInd : index of special comparative value
   * @return int[]
   *
   */
  public static int partition( int arr[], int loPos, int hiPos)
  {
    int pvtPos = loPos;
    int v = arr[pvtPos];

    swap( pvtPos, hiPos, arr);
    int s = loPos;

    for( int i = loPos; i < hiPos; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;}
    }
    swap(s,hiPos,arr);

    return s;
  }//end partition

  /**
   * int fastSelect(int[] arr, int y)
   * DESCRIP
   * Finds yth smallest value in input array
   * 
   * Execution time: O(?)
   */
  public static int fastSelect(int[] arr, int y) {
    int newLoc; // init new loc
    int start = 0; // init start
    int end = arr.length - 1; // init end
    while(true) {
        newLoc = partition(arr, start, end); // partition by current pvt
        if(newLoc < y - 1) { // if val at pvt ended up too small
            start = newLoc;
        } else if(newLoc > y - 1) {
            end = newLoc;
        } else {
            return arr[y - 1];
        }
    }
  }

  public static void main(String[] args) {
      int[] arr = {0, 5, 3, 6, 5};
      System.out.println(fastSelect(arr, 2));
      int[] arr2 = {1, 1, 1, 1, 1};
      System.out.println(fastSelect(arr2, 2));
  }
}
