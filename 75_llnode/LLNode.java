/**
 * Unicorn Unicodes: Eric, Lea, Kosta
 * APCS
 * HW75 -- Nodal Recall
 * 2022-03-14
 * time spent: 00.8 hours
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode
{
  //instance vars
    private String CAR;
    private LLNode CDR;


  // constructor
  public LLNode( String value, LLNode next )
  {
    CAR = value;
    CDR = next;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return CAR; 
  }

  public LLNode getNext()
  {
    return CDR;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    CDR = new LLNode(CAR, null);
    CAR = newCargo;
    return CAR;
  }

  public LLNode setNext( LLNode newNext )
  {
    CDR = newNext;
    return CDR;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return CAR;
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new LLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );

    while( first != null ) {
        System.out.println( first );
        first = first.getNext();
    }
    /* A naive list traversal, has side effects.... ??
    */

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    //A: It can't go back to the node it left because when it goes to the next node, the CAR becomes the String of that new node, and the old CAR and node are lost.

    /* trace:
         *
        / \
      cat  *
          / \
        dog  *
            / \
          cow  *
     
    */

    //...so better: ?
    // Create an way to "save" each node so that going back is possible?
    // We could have nodes be 3 boxes instead of 2, the leftmost is the previous node location, the middle the car of the current node, and the third the location of the next node
    //

  }//end main

}//end class LLNode