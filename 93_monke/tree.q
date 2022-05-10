JRK Kaffe :: Joseph, Ruby, Kosta
APCS pd7
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05
time spent: .5 hrs


DISCO
------------------------------------------------
* 
================================================


QCC
------------------------------------------------
* 
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
    If we consider a tree to grow in an absolute direction from it's root node, then it grows downwards, branching from the root node and it's children/successors.

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
    A tree is a graph without any cycles, and where each node has at most two children nodes.
    A closed tour of a tree will visit all nodes at most 3 times, (... faulty)

Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?
    A balanced tree is allowed a difference of 1 in height between right and left subtrees so that we minimize the amount of time it takes to process any node, if we start from the root.

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
    A balanced tree can alternatively be described as a binary tree optimized for traversing to any given node starting from the root node.

Is a perfect tree complete? 
    Yes!

Is a complete tree balanced? 
    Yes!

Is the Man Who Is Tall Happy?
    ????

What must be true of perfect trees but not others?
    Perfect trees must have an entirely filled in bottom layer, aka all leaves have 0 or 2 children and the heights are all the same for nodes on a given level.
================================================


C'EST POSSIBLE?
------------------------------------------------
< your explanation of whether the tree reconstruction challenge given in class is achievable or not >
================================================
We found that it is possible, considering that the following tree(which we reverse-engineered) satisfies the givens:

    E
     \
      G
     /
    D
   / \
  K   I
     / \
    N   L
       / \
      O   W
