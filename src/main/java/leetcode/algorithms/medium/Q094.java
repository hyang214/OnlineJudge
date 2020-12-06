package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

import leetcode.util.TreeNode;

/**
 * author: Hao 
 * date:Sep 15, 2015
 * time:4:38:16 PM
 * purpose:	Binary Tree Inorder Traversal
 */
public class Q094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        traversal(root, list);
        
        return list;
    }

	private void traversal(TreeNode root, ArrayList<Integer> list) {
		if(root == null)
			return;
		traversal(root.left, list);
		list.add(root.val);
		traversal(root.right, list);
	}
}
