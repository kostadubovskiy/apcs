/*
Team RKL
Ruby F, Kosta D, Lior P
APCS
HW65 -- NQueens
2022-02-16
time spent: 1.5
*/

/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */


public class QueenBoard
{

  private int[][] _board;

  /*** 
   * Initializes 2d array board
  */
  public QueenBoard( int size )
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition:
   * If a solution is found, board shows position of N queens,
   * returns true.
   * If no solution, board is filled with 0's,
   * returns false.
   */

  public boolean solve()
  {
    return solveH(0);
  }


  /***
   * Helper method for solve.
   * Solves horizontally (rows) b
   * Checks if there is a viable square to place a queen for a given column
   */
  private boolean solveH( int col )
  {
    if (col >= _board.length) { // if it's done it's done
      return true;
    }
    for (int i = 0; i < _board.length; i++) { // loop through each row
      if (addQueen(i, col)) { // if a queen is add-able, add it
        if (solveH(col+1) == false) { // if next column is not solvable, remove queen from before. Recursive call
          removeQueen(i, col); // remove queen just placed if the branch that we just recursively built ends up not working/having a solution
        }
        else {
          return true;        
        }
      }
    }
    return false;
  }


  public void printSolution()
  {
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    String result = "";
    for(int c = 0; c < _board.length; c++) {
      for(int[] r : _board) {
        if(r[c] < 1) {
          result += "_";
        } else {
          result += "Q";
        }
      }
      result += "\n";
    }
    System.out.println(result);
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * If square is not able to be attacked by a queen, and doesn't have a queen, then queen is added to that location
   * precondition: no queens in that column
   * postcondition: queen is either placed there and squares it can attack are marked as attacked, or queen is not able to be placed
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * Removes queen from a location
   * precondition: Board has been initialized
   * postcondition: If location is not a queen, returns false. If it is a queen, queen is removed and
                    locations that were rendered "attacked" by the queen's placement become free/0
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * Returns board as readable String
   * precondition: Board has been initialized
   * postcondition: Board is returned as a String
   */
  public String  toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(4);
    if (b.solve()) {
      b.printSolution();
    } else {
      System.out.println("nah");
    }
    /*
    System.out.println(b);
    /** should be...
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0

    b.addQueen(3,0);
    b.addQueen(0,1);
    System.out.println(b);
    /** should be...
       0	 1	-1	-2 -1
       0	 0	-2	0	 0
       0	-1	0	 -1	 0
       1	-1	-1 -1	-2
       0	-1	0	  0	 0

    b.removeQueen(3,0);
    System.out.println(b);
    /** should be...
       0	1	-1	-1 -1
       0	0	-1	0	 0
       0	0	0	 -1	 0
       0	0	0	 0	-1
       0	0	0	 0	0
    */

  }

}//end class
