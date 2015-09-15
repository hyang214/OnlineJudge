package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import leetcode.util.TreeNode;

/**
 * author: Hao 
 * date:Sep 15, 2015
 * time:4:58:08 PM
 * purpose:	Binary Tree Postorder Traversal
 */
public class Q145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        traversal(root, list);
        
        return list;
    }
    
	private void traversal(TreeNode root, ArrayList<Integer> list) {
		if(root == null)
			return;
		traversal(root.left, list);
		traversal(root.right, list);
		list.add(root.val);
	}
}
