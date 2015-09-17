package leetcode.easy;

import leetcode.util.ListNode;

/**
 * author: Hao 
 * date: Sep 16, 2015
 * time: 3:56:39 PM
 * purpose:	Reverse Linked List
 */
public class Q206 {
	/*** iteratively ***/
    public ListNode reverseList(ListNode head) {
        if(head == null)
        	return head;
        ListNode previous = null;
        ListNode current = head;
    	while(current != null){
    		ListNode next = current.next;
    		current.next = previous;
    		previous = current;
    		current = next;	
        }
    	return previous;
    }
    
//    /*** recursively, accepted ***/
//    public ListNode reverseList(ListNode head) {
//    	if(head == null)
//    		return head;
//    	
//        if(head.next == null){
//        	return head;
//        }
//        
//        ListNode root = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        
//        return root; 
//    }
}
