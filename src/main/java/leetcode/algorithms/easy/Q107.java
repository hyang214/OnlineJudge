package leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import leetcode.util.TreeNode;

/**
 * author: Hao 
 * date:Sep 15, 2015
 * time:5:12:36 PM
 * purpose:
 */
public class Q107 {
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
        List<List<Integer>> rvervselevelList = new ArrayList<List<Integer>>();
        for(int i = levelList.size() - 1 ; i > -1 ; i --){
        	rvervselevelList.add(levelList.get(i));
        }
        
        return rvervselevelList;
    }
}
