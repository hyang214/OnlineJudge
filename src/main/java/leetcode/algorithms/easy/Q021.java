package leetcode.algorithms.easy;

import leetcode.util.ListNode;

/***
 author:  hyang
 date:	  Sep 19, 2015
 time:	  10:02:15 PM
 purpose: Merge Two Sorted Lists My Submissions Question Solution 
 ***/
public class Q021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode emptyHead = new ListNode(Integer.MIN_VALUE);
        ListNode current = emptyHead;
        
        while(l1 != null && l2 != null){
        	if(l1.val < l2.val){
        		current.next = l1;
        		l1 = l1.next;
        	}
        	else{
        		current.next = l2;
        		l2 = l2.next;
        	}
        	current = current.next;
        }
        current.next = l1 == null?l2:l1;
        
        return emptyHead.next;
    }
}
