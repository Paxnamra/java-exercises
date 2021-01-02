package practise_exercises.code_wars.fun_with_trees_array_to_tree;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    TreeNode(int value) {
        this(value, null, null);
    }

    @Override
    public boolean equals(Object other) {
        return false;
        // Already implemented for you and used in test cases
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

//You are given a non-null array of integers. Implement the method arrayToTree
//which creates a binary tree from its values in accordance to their order, while creating nodes by depth from left to right.

//For example, given the array [17, 0, -4, 3, 15] you should create the following tree:
//inorder traversal - 17, 0, -4, 3, 15

public class ArrayToTree {
    static TreeNode arrayToTree(int[] array) {
        if (array == null) {
            return null;
        }

        TreeNode node = null;

        for (int value : array) {
            if (node == null) {
                node = new TreeNode(value);
            }
            recursiveAdd(node, value);
        }

        return node;
    }

    private static int recursiveAdd(TreeNode n, int value) {
        if (n.left == null) {
            n.left = new TreeNode(value);
            return n.left.value;
        }

        if (n.right == null) {
            n.right = new TreeNode(value);
            return n.right.value;
        }

        //goes only leftside
        return recursiveAdd(n.left, value);
    }

    /*
    private static int inorder(TreeNode treeNode) {
        int lefty = inorder(treeNode.left);
        int righty = inorder(treeNode.right);

        return treeNode != null ? lefty : righty;
    }
     */

    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 7, 1, -2, 10, -5, -9};
        int[] arr3 = new int[] {2, 4, 7, 1};
        int[] arr2 = null;

        System.out.println(arrayToTree(arr));
        System.out.println(arrayToTree(arr2));
        System.out.println(arrayToTree(arr3));

    }
}
