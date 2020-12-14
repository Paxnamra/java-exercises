package practise_exercises.code_wars.fun_with_trees_max_sum;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class BinaryTreeMaxTest {
    private TreeNode node;

    @Before
    public void setup() {
        node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
    }

    @Test
    public void shouldBinaryTreeMax_traverseTree_AndReturnMaxNodesSum() {
        assertThat(BinaryTreeMax.maxSum(node), is(5));
    }
}