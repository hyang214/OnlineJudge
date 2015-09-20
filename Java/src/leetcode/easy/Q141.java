package leetcode.easy;

import leetcode.util.ListNode;

/***
 author:  hyang
 date:	  Sep 17, 2015
 time:	  4:39:03 PM
 purpose: Linked List Cycle
 ***/
public class Q141 {
	public boolean hasCycle(ListNode head) {
	       if(head == null)
	            return false;
	        ListNode one = head;
	        ListNode two = head;
	        do{
	        	one = one.next;
	    		if(two.next != null){
	    			two = two.next.next;
	    		}else{
	    			return false;
	    		}
	    		
	        	if(one == two)
	        		return true;
	        }while(one != null && two != null);
	        return false;
	    }
}
