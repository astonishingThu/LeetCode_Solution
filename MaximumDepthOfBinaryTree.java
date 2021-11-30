public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        
    }

    public static int maxDepth(TreeNode root) {  // Depth First Search Approach
        if (root==null) return 0;
        return 1 + Integer.max(maxDepth(root.left), maxDepth(root.right));
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value) {
        this.value = value;
    }
}
