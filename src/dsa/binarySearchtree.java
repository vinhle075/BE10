package dsa;

public class binarySearchtree {
    public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;

	    public TreeNode(int val) {
	        this.val = val; 
	        left = null;
	        right = null; 
	    }
	}
    public boolean search(TreeNode root, int target) {
	    if (root == null) {
	        return false;
	    }

	    if (target > root.val) {
	        return search(root.right, target);
	    } else if (target < root.val) {
	        return search(root.left, target);
	    } else {
	        return true;
	    }
	}
}
