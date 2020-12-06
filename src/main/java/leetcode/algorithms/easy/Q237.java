package leetcode.algorithms.easy;

import leetcode.util.ListNode;

public class Q237 {
    public void deleteNode(ListNode node) {
    	if(node == null || node.next == null) 
    			return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
