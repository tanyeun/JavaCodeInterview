import org.junit.Test;

import static org.junit.Assert.*;

public class BasicsTest {
    private BinaryTree<Integer> tree;
    private int height;
    private int size;

    @Test
    public void test1(){
        tree = BinaryTreeUtil.getTestTree1();
        height = 3;
        size = 6;
        assertEquals(height, Basics.height(tree));
        assertEquals(size, Basics.size(tree));
    }
}
