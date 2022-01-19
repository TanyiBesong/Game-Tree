// BinaryTreeBasis.java
//Root binary tree class
//Author: Tanyi Besong
//Date: 3/26/2021

public abstract class BinaryTreeBasis<T> {
  protected TreeNode<T> root;

  public BinaryTreeBasis() {
    root = null;
  }  // end default constructor

  public BinaryTreeBasis(T rootItem) {
    root = new TreeNode<T>(rootItem, null, null);
  }  // end constructor

  public boolean isEmpty() {
  // Returns true if the tree is empty, else returns false.
    return root == null;
  }  // end isEmpty

  public void makeEmpty() {
  // Removes all nodes from the tree.
    root = null;
  }  // end makeEmpty

  public T getRootItem() throws TreeException {
  // Returns the item in the tree's root.
    if (root == null) {
      throw new TreeException("TreeException: Empty tree");
    }
    else {
      return root.item;
    }  // end if
  }  // end getRootItem

  public abstract void setRootItem(T newItem) throws UnsupportedOperationException;
    // Throws UnsupportedOperationException if operation
    // is not supported.

}  // end BinaryTreeBasis