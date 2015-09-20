package leetcode.easy;

import leetcode.util.TreeNode;

/***
 author:  hyang
 date:	  Sep 20, 2015
 time:	  3:36:11 PM
 purpose: Balanced Binary Tree
 ***/
public class Q110 {
	public boolean isBalanced(TreeNode root) {
		if(root == null)
			return true;
		else if(Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1)
        	return isBalanced(root.left) && isBalanced(root.right);
        else
        	return false;
    }
	
	private int maxDepth(TreeNode node){
		if(node == null)
			return 0;
		else if(node.left == null && node.right == null)
			return 1;
		else
			return Math.max(maxDepth(node.left), maxDepth(node.right))+1;
	}
}
