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

    static void inorder(TreeNode treeNode) {
        if (treeNode == null)
            return;

        // Traverse left
        inorder(treeNode.left);
        // Traverse root
        System.out.print(treeNode.value + " ");
        // Traverse right
        inorder(treeNode.right);
    }

    static void postorderStepsDescription(TreeNode treeNode, int parentVal, String branch) {
        if (treeNode == null) {
            System.out.printf("TreeNode %d has no kids on the %s%n", parentVal, branch);
            return;
        }
        System.out.printf("Checking from %d %n", treeNode.value);

        postorderStepsDescription(treeNode.left, treeNode.value, "lefty");
        postorderStepsDescription(treeNode.right, treeNode.value, "righty");

        System.out.printf("traversed from %d to %d %n", parentVal, treeNode.value);
    }

    public static int maxSum(TreeNode node) {
        return node != null ? Math.max(maxSum(node.left), maxSum(node.right)) + node.value : 0;
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

        System.out.println();
        System.out.println("\nPostorder with steps described traversal: ");
        postorderStepsDescription(root, root.value, "Root, man...");

        System.out.println();
        System.out.println("Max value is: " + maxSum(root));
    }
}