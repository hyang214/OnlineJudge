package leetcode.easy;

import java.util.Stack;

import leetcode.util.TreeNode;

/**
 * author: Hao 
 * date:Sep 14, 2015
 * time:8:00:12 PM
 * purpose: Same Tree
 */
public class Q100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if((p == null && q != null) || (p != null && q == null))
    		return false;
    		
    	Stack<TreeNode> pStack = new Stack<TreeNode>();
        pStack.push(p);
        Stack<TreeNode> qStack = new Stack<TreeNode>();
        qStack.push(q);
        while(!pStack.isEmpty() && !qStack.isEmpty()){
        	TreeNode pn = pStack.pop();
        	TreeNode qn = qStack.pop();
 
        	if(pn.val != qn.val)
        		return false;
        	
        	if(pn.right != null && qn.right != null){
        		pStack.push(pn.right);
        		qStack.push(qn.right);
        	}else if((pn.right != null && qn.right == null) || pn.right == null && qn.right != null){
        		return false;
        	}
        	
        	if(pn.left != null && qn.left != null){
        		pStack.push(pn.left);
        		qStack.push(qn.left);
        	}else if((pn.left != null && qn.left == null) || pn.left == null && qn.left != null){
        		return false;
        	}
        }
    	
        return true;
    }
}
