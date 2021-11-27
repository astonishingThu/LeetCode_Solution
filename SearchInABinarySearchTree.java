public class SearchInABinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        int value = 2;
    }

    public static TreeNode searchBST(TreeNode root, int value) { // Recursion
        if (root==null) return root;

        if (root.value==value) return root;
        if (value>root.value) return searchBST(root.right, value);
        return searchBST(root.left, value);
    }

    public static TreeNode search2BST(TreeNode root, int value) { // iterative
        if (root==null) return root;
        while (root!=null) {
            if (root.value == value) return root;
            if (value>root.value) root = root.right;
            else root = root.left;
        }
        return null;
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