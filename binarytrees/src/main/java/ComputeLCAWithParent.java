public class ComputeLCAWithParent {

    /*
    10.4
    */

    public static BinaryTreeParent<Integer> LCA(BinaryTreeParent<Integer> node0,
                                                BinaryTreeParent<Integer> node1) {
        int zeroHeight = findDepth(node0);
        int oneHeight = findDepth(node1);
        try {
            while (!node0.equals(node1)) {
                if (zeroHeight > oneHeight) {
                    node0 = node0.parent;
                    --zeroHeight;
                } else if (zeroHeight < oneHeight) {
                    node1 = node1.parent;
                    --oneHeight;
                } else {
                    node0 = node0.parent;
                    node1 = node1.parent;
                }
            }
        } catch (NullPointerException e) {
            return null;
        }

        return node0;
    }

    private static int findDepth(BinaryTreeParent<Integer> node) {
        if (node!=null) {
            return 1 + findDepth(node.parent);
        }
        return 0;
    }

    public static BinaryTreeParent<Integer> LCA_v2(BinaryTreeParent<Integer> node0,
                                                   BinaryTreeParent<Integer> node1) {
        int depth0 = getDepth(node0);
        int depth1 = getDepth(node1);

        // Make node0 the deeper node to simplify the code
        if(depth0 < depth1){
            BinaryTreeParent<Integer> tmp = node1;
            node1 = node0;
            node0 = tmp;
        }

        // Ascends from node0
        int depthDiff = Math.abs(depth0 - depth1);
        while( depthDiff-- > 0){
            node0 = node0.parent;
        }

        // Ascends both nodes until reaches the LCA
        while( node0 != node1 ){
            node0 = node0.parent;
            node1 = node1.parent;
        }
        return node0;
    }

    private static int getDepth(BinaryTreeParent<Integer> node) {
        int depth = 0;
        while (node.parent!=null) {
            ++depth;
            node = node.parent;
        }
        return depth;
    }
}
