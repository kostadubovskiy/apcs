<<<<<<< HEAD

=======
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
/**
 * class TreeNode
 * SKELETON
 * Implements a node for use in a binary tree.
 * Only holds int cargo.
 */

public class TreeNode
{

  //instance variables / attributes of a TreeNode:
  int _cargo;        //this node's data
  TreeNode _lt, _rt; //pointers to left, right subtrees


  /**
   * default constructor
   * Construct a tree node with specified value,
   * with null left and right subtrees.
   */
  TreeNode( int initValue )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    _cargo = initValue;
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }


  /**
   * overloaded constructor
   * Construct tree node w specified value, left, and right subtrees.
   */
  TreeNode( int initValue, TreeNode initLeft, TreeNode initRight )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    _cargo = initValue;
    _lt = initLeft;
    _rt = initRight;
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }


  /**
   * Returns the left subtree of this node.
   */
  TreeNode getLeft()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    return _lt;
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }


  /**
   * Returns the right subtree of this node.
   */
  TreeNode getRight()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    return _rt;
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }


  /**
   * Returns the value stored in this tree node.
   */
  int getValue()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    return _cargo;
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }


  /**
   * Sets the value of the left subtree of this node.
   */
  void setLeft( TreeNode theNewLeft )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    _lt = theNewLeft;
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }


  /**
   * Sets the value of the right subtree of this node.
   */
  void setRight( TreeNode theNewRight )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
<<<<<<< HEAD
=======
    _rt = theNewRight;
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }


  /**
   * Sets the value of this tree node.
   */
<<<<<<< HEAD
  void setValue( int theNewValue )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
=======
  void setValue( int theNewValue ) 
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    _cargo = theNewValue;
>>>>>>> ec720658bcf770d45d334fd2ade8975bdc47ae34
  }

}//end class
