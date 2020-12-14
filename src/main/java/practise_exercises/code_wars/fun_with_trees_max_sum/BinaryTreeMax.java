package practise_exercises.code_wars.fun_with_trees_max_sum;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    TreeNode(int valNode) {
        this.value = valNode;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }
}

public class BinaryTreeMax {
    static void preorder(TreeNode TreeNode) {
        if (TreeNode == null)
            return;

        // Traverse root
        System.out.print(TreeNode.value + " ");
        // Traverse left
        preorder(TreeNode.left);
        // Traverse right
        preorder(TreeNode.right);
    }

    static void postorder(TreeNode TreeNode) {
        if (TreeNode == null) {
            return;
        }

        // Traverse left
        postorder(TreeNode.left);
        // Traverse root
        System.out.print(TreeNode.value + " ");
        // Traverse right
        postorder(TreeNode.right);
    }

    static void inorder(TreeNode TreeNode) {
        if (TreeNode == null)
            return;

        // Traverse left
        inorder(TreeNode.left);
        // Traverse root
        System.out.print(TreeNode.value + " ");
        // Traverse right
        inorder(TreeNode.right);
    }
    
    public static int maxSum(TreeNode node) {
        return 0;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        System.out.println("\nPreorder: ");
        preorder(root);

        System.out.println("\nPostorder: ");
        postorder(root);

        System.out.println("\nInorder: ");
        inorder(root);
    }
}