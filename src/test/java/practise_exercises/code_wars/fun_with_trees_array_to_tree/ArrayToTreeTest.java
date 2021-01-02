package practise_exercises.code_wars.fun_with_trees_array_to_tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class ArrayToTreeTest {

    @Test
    public void emptyArray() {
        TreeNode expected = null;
        assertThat(ArrayToTree.arrayToTree(arrayFrom()), is(expected));
    }

    @Test
    public void arrayWithMultipleElements() {
        TreeNode expected = new TreeNode(17, new TreeNode(0, new TreeNode(3), new TreeNode(15)), new TreeNode(-4));
        assertThat(ArrayToTree.arrayToTree(arrayFrom(17, 0, -4, 3, 15)), is(expected));
    }

    private int[] arrayFrom(int... values) {
        return values;
    }
}