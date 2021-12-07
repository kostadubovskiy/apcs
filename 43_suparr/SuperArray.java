// Team BPK: Ben Belotser, Perry Huang, Kosta Dubovskiy
// APCS pd07
// HW43 -- Array of Steel (basic SuperArray functionality)
// 2021-12-06

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _size = 10;
    _data = new int[_size];
    for (int i = 0; i < _data.length; i++) {
        _data[i] = 0;
    }  
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String result = "[";
    for (int i = 0; i < _data.length - 1; i++) {
        result += _data[i] + ", ";
    }
    result += _data[_data.length - 1] + "]";
    return result;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] _data = new int[this._data.length * 2];
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int oldVal = get(index);
    _data[index] = newVal; 
    return oldVal;
  }


  //main method for testing
  public static void main( String[] args )
  {

      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      for( int i = 0; i < curtis._data.length; i++ ) {
        curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
        curtis.expand();
        System.out.println("Printing expanded SuperArray curtis...");
        System.out.println(curtis);
      }

  }//end main()


}//end class