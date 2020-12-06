package leetcode.algorithms.easy;

import leetcode.util.TreeNode;

/**
 * author: Hao 
 * date:Sep 15, 2015
 * time:3:36:15 PM
 * purpose: Invert Binary Tree
 */
public class Q226 {
    public TreeNode invertTree(TreeNode root) {
    	if(root == null)
    		return null;
    	
        TreeNode tmp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(tmp);
        return root;
    }
}
