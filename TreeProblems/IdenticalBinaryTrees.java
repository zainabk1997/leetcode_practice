package TreeProblems;

public class IdenticalBinaryTrees {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        boolean result=false;
        if(p == null && q == null)return true;
        if(p == null || q == null)return false;

        boolean leftSubtreeCheck = isSameTree(p.left, q.left);
        boolean rightSubtreeCheck = isSameTree(p.right, q.right);
        if(p.val == q.val && leftSubtreeCheck && rightSubtreeCheck) result = true;

        return result;
        
    }
    
    public static void main(String[] args) {
        IdenticalBinaryTrees solution = new IdenticalBinaryTrees();
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        boolean result = solution.isSameTree(p,q);
        System.out.println("Are they the same trees? " + result);
    }
}
