package leetcode.easy;

import leetcode.util.TreeNode;

/**
 * author: Hao 
 * date:Sep 15, 2015
 * time:4:18:17 PM
 * purpose:	Lowest Common Ancestor of a Binary Search Tree
 */
public class Q235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	if(root == null)
    		return null;
    	
        if(root == p)
        	return root;
        
        if(root == q)
        	return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)
        	return root;
        else if(left != null && right == null)
        	return left;
        else if(left == null && right != null)
        	return right;
        else
        	return null;
    }
}
