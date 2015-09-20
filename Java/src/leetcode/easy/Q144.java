package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import leetcode.util.TreeNode;

/**
 * author: Hao 
 * date:Sep 15, 2015
 * time:4:52:01 PM
 * purpose: Binary Tree Pretorder Traversal
 */
public class Q144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        traversal(root, list);
        
        return list;
    }
    
	private void traversal(TreeNode root, ArrayList<Integer> list) {
		if(root == null)
			return;
		list.add(root.val);
		traversal(root.left, list);
		traversal(root.right, list);
	}
}
