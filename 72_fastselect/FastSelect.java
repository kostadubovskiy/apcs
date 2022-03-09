public class FastSelect {
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
  public static int[] partition( int arr[], int start, int end, int splitInd)
  {
	int splitVal = arr[splitInd];
	swap(splitInd, end, arr);
	int numSwaps = start;
	for (int i = start; i < end; i++) {
		if (arr[i] < splitVal) {
            swap(i, numSwaps , arr);
			numSwaps += 1;
		}
	}
	swap(end, numSwaps, arr);
	return arr;
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
    int pvtInd = (start + end) / 2; // first pvt is middle, arbitrary choice
    int pvtVal; // init val at pvt
    while(true) {
        pvtVal = arr[pvtInd]; // get val at pvt
        arr = partition(arr, start, end, pvtInd); // partition by current pvt
        newLoc = find(arr, pvtVal); // find where val at pvt ended up
        if(newLoc < y) { // if val at pvt ended up too small
            start = newLoc;
        } else if(newLoc > y) {
            end = newLoc;
        } else {
            return arr[y - 1];
        }
        pvtInd = (start + end) / 2;
    }
  }
}
