package _160623;


public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		if (root == null) return null;
		TreeNode tmp = invertTree(root.left);
		root.left = invertTree(root.right);
		root.right = tmp;
		return root;
	}

	
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
