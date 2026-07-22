package dsa;

public class depthFirst {
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
// inorder traversal
    public void inorder(TreeNode root) {
	    if (root == null) {
	        return;
	    }
	    inorder(root.left);
	    System.out.println(root.val);
	    inorder(root.right);
	}
// preorder traversal
    public void preorder(TreeNode root) {
	    if (root == null) {
	        return;
	    }
	    System.out.println(root.val);
	    preorder(root.left);
	    preorder(root.right);
	}
// postorder traversal
    public void postorder(TreeNode root) {
	    if (root == null) {
	        return;
	    }  
	    postorder(root.left);
	    postorder(root.right);
	    System.out.println(root.val);
	}
}
