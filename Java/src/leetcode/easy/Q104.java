package leetcode.easy;

import leetcode.util.TreeNode;

/**
 * author: Hao 
 * date:Sep 15, 2015
 * time:9:13:11 AM
 * purpose:	Maximum Depth of Binary Tree
 */
public class Q104 {
    public int maxDepth(TreeNode root) {
        if(root == null)
        	return 0;
        else{
        	return Math.max(maxDepth(root.left), maxDepth(root.left))+1; 
        }
    }
}
