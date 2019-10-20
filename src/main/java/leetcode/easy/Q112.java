package leetcode.easy;

import leetcode.util.TreeNode;

/***
 author:  hyang
 date:	  Sep 21, 2015
 time:	  11:33:06 AM
 purpose: Path Sum	
 ***/
public class Q112 {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
        	return false;
        else{
        	if(sum == root.val && root.left == null && root.right == null)
        		 return true;
        	else 
        		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(-1);
		root.right = new TreeNode(-3);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(-2);
		root.right.right = null;
		root.left.left.left = new TreeNode(-1);
		
		Q112 q112 = new Q112();
		q112.hasPathSum(root, -1);
	}
}
