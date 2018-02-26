public class Basics {
    // Get size of binary tree
    //   size : the total number of nodes in the tree
    public static int size(BinaryTree<Integer> root){
        if( root == null ){
            return 0;
        }
        int leftSize = size(root.left);
        int rightSize = size(root.right);

        return 1 + leftSize + rightSize;
    }

    // Get height of binary tree
    //   height : the max depth of the tree
    public static int height(BinaryTree<Integer> root){
        if( root == null )
            return -1;  // There's another definition you return 0 here

        int heightLeft = height(root.left);
        int heightRight = height(root.right);


        return 1 + Math.max(heightLeft, heightRight);
    }
}
