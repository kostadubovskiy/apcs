<<<<<<< HEAD
=======
import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;
import javax.swing.text.PlainDocument;

>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
  }

<<<<<<< HEAD
=======
  /**
   * overloaded constructor
   */
  BST(TreeNode root)
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    _root = root;
  }

>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34

  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
<<<<<<< HEAD
=======

>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
    /*** YOUR IMPLEMENTATION HERE ***/
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    if(stRoot.getValue() < newNode.getValue()) {
      if(stRoot.getRight() == null) {
        stRoot.setRight(newNode);
      } else {
        insert(stRoot.getRight(), newNode);
      }
    } else if (stRoot.getValue() > newNode.getValue()) {
      if(stRoot.getLeft() == null) {
        stRoot.setLeft(newNode);
      } else {
        insert(stRoot.getLeft(), newNode);
      }
    } else if (stRoot.getValue() == newNode.getValue()) {
      insert(stRoot.getLeft(), newNode);
    }
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
<<<<<<< HEAD
    preOrderTrav( _root );
=======
    preOrderTrav( _root);
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }
  public void preOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    if(currNode.getLeft() == null && currNode.getRight() == null) {
      System.out.println(currNode.getValue());
    }
    System.out.println(currNode.getValue());
    preOrderTrav(currNode.getLeft());
    preOrderTrav(currNode.getRight());
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    inOrderTrav(_root);
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }
  public void inOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    if(currNode.getLeft() == null && currNode.getRight() == null) {
      System.out.print(currNode.getValue());
    }
    inOrderTrav(currNode.getLeft());
    System.out.println(currNode.getValue());
    inOrderTrav(currNode.getRight());
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    postOrderTrav(_root);
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }
  public void postOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    if(currNode.getLeft() == null && currNode.getRight() == null) {
      System.out.println(currNode.getValue());
    }
    postOrderTrav(currNode.getLeft());
    postOrderTrav(currNode.getRight());
    System.out.println(currNode.getValue());
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //main method for testing
  public static void main( String[] args )
  {
<<<<<<< HEAD
    /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      BST arbol = new BST();
      //PROTIP: sketch state of tree after each insertion
      //        ...BEFORE executing these.
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 6 );
      arbol.insert( 1 );
      arbol.insert( 3 );
      System.out.println( "\n-----------------------------");
      System.out.println( "pre-order traversal:" );
      arbol.preOrderTrav();
      System.out.println( "\n-----------------------------");
      System.out.println( "in-order traversal:" );
      arbol.inOrderTrav();
      System.out.println( "\n-----------------------------");
      System.out.println( "post-order traversal:" );
      arbol.postOrderTrav();
=======
    
    BST arbol = new BST();
    
    //PROTIP: sketch state of tree after each insertion
    //        ...BEFORE executing these.
    arbol.insert( 4 );
    arbol.insert( 2 );
    arbol.insert( 5 );
    arbol.insert( 6 );
    arbol.insert( 1 );
    arbol.insert( 3 );
    
    System.out.println( "\n-----------------------------");
    System.out.println( "pre-order traversal:" );
    arbol.preOrderTrav();
    /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~

      System.out.println( "\n-----------------------------");
      System.out.println( "in-order traversal:" );
      arbol.inOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "post-order traversal:" );
      arbol.postOrderTrav();

>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
      System.out.println( "\n-----------------------------");
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class
