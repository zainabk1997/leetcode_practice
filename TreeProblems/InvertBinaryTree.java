package TreeProblems;
import TreeProblems.TreeNode;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        // base condition
        if (root == null) return root;

        // recursive call to smallest node
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        //swap
        root.right = left;
        root.left = right;

        return root;
    }


    public static void main(String[] args) {
        InvertBinaryTree solution = new InvertBinaryTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode result = solution.invertTree(root);
        System.out.println("The inverted tree is here: " + result);
    }
}
