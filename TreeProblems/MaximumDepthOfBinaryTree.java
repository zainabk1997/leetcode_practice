package TreeProblems;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root==null){
            return 0;
        }
        
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        depth = Math.max(lh,rh)+1;

        return depth;
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int depth = solution.maxDepth(root);
        System.out.println("Max depth of the tree: " + depth);
    }
    
}