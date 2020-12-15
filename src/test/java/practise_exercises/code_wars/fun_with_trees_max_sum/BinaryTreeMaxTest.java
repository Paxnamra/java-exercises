package practise_exercises.code_wars.fun_with_trees_max_sum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinaryTreeMaxTest {
    private TreeNode node;
    private final PrintStream systemOuptut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setup() {
        node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);

        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void shouldBinaryTreeMax_traverseTree_AndReturnMaxNodesSum() {
        assertThat(BinaryTreeMax.maxSum(node), is(5));
    }

    @Test
    public void shouldBinaryTreeMax_postorderTraverseTree_AndReturnVisitedNodesValues() {
        BinaryTreeMax.postorder(node);
        Assert.assertEquals("3 4 1 2 0", outputStream.toString().trim());
    }
}