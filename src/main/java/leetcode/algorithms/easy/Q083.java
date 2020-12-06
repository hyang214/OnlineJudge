package leetcode.algorithms.easy;

import java.util.HashSet;

import leetcode.util.ListNode;

/**
 **author:	yangh
 **date:	Sep 15, 2015
 **time:	11:18:46 PM
 **use:		Remove Duplicates from Sorted List
 */
public class Q083 {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head == null)
    		return head;
    	
    	HashSet<Integer> set = new HashSet<Integer>();
    	ListNode priori = head;
    	set.add(head.val);
    	ListNode current = head.next;
    	while(current != null){
    		if(set.contains(current.val)){
    			priori.next = current.next;
    		}else{
    			set.add(current.val);
    			priori = current;
    		}
    		current = current.next;
    	}
    	return head;
    }
}

