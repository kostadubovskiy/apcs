/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private LLNode<SWASHBUCKLE> _queue;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _size = 0;
    _front = _queue;
    _end = _front;
  }


  public void enqueue( SWASHBUCKLE enQVal )
  {
    if(isEmpty()){
      LLNode<SWASHBUCKLE> temp = new LLNode<SWASHBUCKLE>(enQVal, null);
      _queue = temp;
      _front = _queue;
      _end = _queue;
    }
    else{
        LLNode<SWASHBUCKLE> temp = new LLNode<SWASHBUCKLE>(enQVal, null);
        _end.setNext(temp);
        _end = _end.getNext();
    }
  }//O(?)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    int index = Math.random() * _size;
    int i = 0;
    LLNode beforeTarget = _front;
    while(i < index - 1) {
      beforeTarget = beforeTarget.getNext();
      i++;
    }
    LLNode target = beforeTarget.getNext();
    beforeTarget.setNext(beforeTarget.getNext().getNext());
    return target;
  }//O(?)


  public SWASHBUCKLE peekFront()
  {

  }//O(?)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   < YOUR SUCCINCT SUMMARY HERE >
   **/
  public void sample ()
  {

  }//O(?)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(?)


  // print each node, separated by spaces
  public String toString()
  {

  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {

      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    
    Queue<String> PirateQueue = new RQueue<String>();
    System.out.println("\nnow enqueuing..."); 
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");
    System.out.println("\nnow testing toString()..."); 
    System.out.println( PirateQueue ); //for testing toString()...
    System.out.println("\nnow dequeuing..."); 
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n"); 
    System.out.println( PirateQueue.dequeue() );
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue