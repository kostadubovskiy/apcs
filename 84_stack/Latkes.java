/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO

    QCC

 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
    _stackSize = initCapacity;
    _stack = new String[initCapacity];
  }// O(1)


  //means of insertion
  public void push( String s )
  {
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
    if (not isFull()) {
      _stack[_stackSize] = s;
    } else {
      String[] _stackExtended = new String[_stack.length() * 2];
      for (int i = 0; i < _stackSize; i ++) {
        _stackExtended[i] = _stack[i];
      }
      _stack = _stackExtended;
    }
    _stackSize += 1;
  }// O(n)

  //means of removal
  public String pop( )
  {
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
    String temp = _stack[_stackSize - 1];
    _stack[_stackSize - 1] = null;
    return temp;
  }// O(n)


  //chk for emptiness
  public boolean isEmpty()
  {
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
    if (_stack[0] == null) {
      return true;
    }
    return false;
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
    if (_stack[_stack.length() - 1] != null) {
      return false;
    }
    return true;
  }// O(?)


  //main method for testing
  public static void main( String[] args )
  {

    Latkes tastyStack = new Latkes(10);
    tastyStack.push("aoo");
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");

    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
