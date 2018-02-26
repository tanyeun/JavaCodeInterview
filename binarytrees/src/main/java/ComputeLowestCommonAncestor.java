import java.util.Stack;

// ComputeLCA when No parent pointer
public class ComputeLowestCommonAncestor {

    /*
    10.3 Compute the Lowest Common Ancestor in a binary tree
         Method 1
    */
    public static BinaryTree<Integer> LCA(BinaryTree<Integer> tree, BinaryTree<Integer> node0, BinaryTree<Integer> node1) {
        Stack<BinaryTree<Integer>> zero = dfs(tree, node0, new Stack<>());
        Stack<BinaryTree<Integer>> one = dfs(tree, node1, new Stack<>());

        //ITERATE BOTH STACKS
        while (!zero.isEmpty() && !one.isEmpty()) {
            if (zero.size() > one.size()) {
                //IF STACK ZERO IS BIGGER GET TO SAME LEVEL AS ONE
                zero.pop();
            } else if (zero.size() < one.size()) {
                //IF STACK ONE IS BIGGER GET TO SAME LEVEL AS ZERO
                one.pop();
            } else {
                //IF STACKS ARE EQUAL SEE IF THEY HAVE THE SAME NODE
                if (zero.peek().equals(one.peek()))
                    return zero.pop();
                zero.pop();
                one.pop();
            }
        }

        return new BinaryTree<>(0);
    }

    // Method 1 helper function
    private static Stack<BinaryTree<Integer>> dfs(BinaryTree<Integer> tree, BinaryTree<Integer> node, Stack<BinaryTree<Integer>> stack) {
        if (tree == null)
            return stack;
        stack.push(tree);
        if (stack.peek().equals(node)) {
            return stack;
        }

        dfs(tree.left, node, stack);
        if (stack.peek().equals(node)) {
            return stack;
        }

        dfs(tree.right, node, stack);
        if (stack.peek().equals(node)) {
            return stack;
        }

        stack.pop();
        return stack;
    }

    // Method 2, pure recursive
    public static BinaryTree<Integer> LCA_v2(BinaryTree<Integer> root,
                                             BinaryTree<Integer> node0,
                                             BinaryTree<Integer> node1) {
        if( root == null ) return null;
        if( node0 == root || node1 == root ) return root;

        BinaryTree<Integer> leftLCA = LCA_v2(root.left, node0, node1);
        BinaryTree<Integer> rightLCA = LCA_v2(root.right, node0, node1);

        if( leftLCA != null && rightLCA != null) return root;
        if( leftLCA == null && rightLCA == null) return null;

        return leftLCA != null ? leftLCA : rightLCA;
    }

    private static class Status {
        public int numTargetNodes; // Num of nodes found in the tree
                                   // could be 0, 1 or 2
        public BinaryTree<Integer> ancestor;

        public Status(int num, BinaryTree<Integer> node){
            this.numTargetNodes = num;
            this.ancestor = node;
        }
    }

    public static Status LCAHelper(BinaryTree<Integer> root,
                                             BinaryTree<Integer> node0,
                                             BinaryTree<Integer> node1){
       if( root == null ) return new Status(0, null);

       Status left = LCAHelper(root.left, node0, node1);
       // Found both nodes in the left subtree
       if( left.numTargetNodes == 2 ) return left;

       Status right = LCAHelper(root.right, node0, node1);
       if( right.numTargetNodes == 2 ) return right;

       int numNodesFound = left.numTargetNodes + right.numTargetNodes +
               (root == node0 ? 1 : 0) + (root == node1 ? 1 : 0);
       BinaryTree<Integer> ca = numNodesFound == 2 ? root : null;

       return new Status(numNodesFound, ca);
    }

    public static BinaryTree<Integer> LCA_v3(BinaryTree<Integer> root,
                                             BinaryTree<Integer> node0,
                                             BinaryTree<Integer> node1) {
        return LCAHelper(root, node0, node1).ancestor;
    }
}
