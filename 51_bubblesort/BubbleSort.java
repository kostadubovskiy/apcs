// Team BPK: Ben Belotser, Perry Huang, Kosta Dubovskiy
// APCS pd07
// HW51 -- Dat Bubbly Tho/Bubble Algorithm/Making a simple bubble algorithm
// 2022-01-03
// time spent: 0.5 hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * Infinite while loop.
 * Is the number of swaps 0? If yes, then reset it to 1 and return.
 * If not, then proceed.
 * Compare the rightmost number with its adjacent number. If the adjacent number is more than the other, swap them.
 * Do this for the entire ArrayList.
 * For every swap, increment swaps.
 * Go back up because of infinite while loop.
 * DISCO
 * I discovered that I'm not really sure of the QCC answers that I put, but am sure that they are reasonably close.
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: The array is sorted.
 * q1: After pass p, what do you know?
 * a1: The array is ordered up to index p.
 * q2: How many passes are necessary to completely sort?
 * a2: At most the length of the array.
 
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{
    public static int swaps = 1;
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

    public static void swap(ArrayList<Integer> data, int i, int j) {
    int temp = data.get(j);
    data.set(j, data.get(i));
    data.set(i, temp);

  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Integer> data )
  {
    while (true) {
        if (swaps == 0) {
            swaps = 1;
            return;
        }
        swaps = 0;
        for (int i = data.size() - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
              if (data.get(i) < data.get(j)) {
                swap(data, i, j);
                swaps += 1;
              }
            }
    }
  }
}


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  /*
  public static ArrayList<Integer> bubbleSort( ArrayList<Integer> input )
  {
    // ran out of time to do this one
  }
  */

  public static void main( String [] args )
  {
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );

    /*==========for AL-returning methods==========
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n" 
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n" 
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
      ============================================*/

  }//end main

}//end class BubbleSort