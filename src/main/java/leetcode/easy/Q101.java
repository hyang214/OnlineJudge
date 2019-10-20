package leetcode.easy;

import leetcode.util.TreeNode;

/***
 author:  hyang
 date:	  Sep 20, 2015
 time:	  3:52:54 PM
 purpose: Symmetric Tree
 ***/
public class Q101 {
	public boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))
        	return true;
        else
        	return travel(root.left,root.right);
    }

	private boolean travel(TreeNode left, TreeNode right) {
		if(left == null && right == null)
			return true;
		else if((left == null && right != null) || (left != null && right == null))
			return false;
		else if(left.val == right.val){
			return travel(left.left, right.right) && travel(left.right, right.left); 
		}else{
			return false;
		}
	}
}
