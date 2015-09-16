package leetcode.easy;

import java.util.LinkedList;

import leetcode.util.TreeLinkNode;

/**
 * author: Hao 
 * date:Sep 16, 2015
 * time:10:18:46 AM
 * purpose:	Populating Next Right Pointers in Each Node
 */
public class Q116 {
	
    public void connect(TreeLinkNode root) {
    	if(root == null)
    		return;
    	
    	LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);
        while(!queue.isEmpty()){
        	LinkedList<TreeLinkNode> newQueue = new LinkedList<TreeLinkNode>();
        	if(queue.size() > 1){
        		for(int i = 0 ; i < queue.size() ; i ++){
        			if(i < queue.size() - 1)
        				queue.get(i).next = queue.get(i+1);
        			if(queue.get(i).left != null)
        				newQueue.add(queue.get(i).left);
        			if(queue.get(i).right != null)
        				newQueue.add(queue.get(i).right);
        		}
        	}else{
        		if(queue.get(0).left != null)
    				newQueue.add(queue.get(0).left);
    			if(queue.get(0).right != null)
    				newQueue.add(queue.get(0).right);
        	}
        	queue = newQueue;
        }
    }
}
