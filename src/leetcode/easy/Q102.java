package leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import leetcode.util.TreeNode;

/**
 * author: Hao 
 * date:Sep 15, 2015
 * time:4:59:47 PM
 * purpose:	Binary Tree Level Order Traversal
 */
public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> levelList = new ArrayList<List<Integer>>();
    	if(root == null)
    		return levelList;
    	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while(!queue.isEmpty()){
        	ArrayList<Integer> list = new ArrayList<Integer>();
        	LinkedList<TreeNode> newQueue = new LinkedList<TreeNode>();
        	while(!queue.isEmpty()){
        		TreeNode tn = queue.poll();
        		list.add(tn.val);
        		if(tn.left != null)
        			newQueue.add(tn.left);
        		if(tn.right != null)
        			newQueue.add(tn.right);
        	}
        	queue = newQueue;
        	levelList.add(list);
        }
        
        return levelList;
    }
}
