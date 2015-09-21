package leetcode.medium;

import leetcode.util.ListNode;

public class Q002 {
	 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        ListNode r;
    	int nextCarry = 0;
    	
    	if(l1 == null && l2 == null){
    		/*** ��Խ�λ����һλ����� ***/
    		r = new ListNode(carry);
    	}
    	else if( (l1 == null && l2 != null) || (l2 == null && l1 != null)){
    		/*** ���λ����һ�� ***/
    		ListNode one = (l1 == null)?l2:l1;
    		int add = one.val + carry;
    		r = new ListNode(add % 10);
    		nextCarry = add / 10;
    		if(add > 9){
    			ListNode next = addTwoNumbers(l1==null?null:l1.next, l2==null?null:l2.next, nextCarry);
    			r.next = next;
    		}else if(one.next != null){
    			r.next = one.next;
    		}
        }else{
        	int add = l1.val + l2.val + carry;
            nextCarry = add / 10;
            add = add % 10;
        	r = new ListNode(add);
        	
        	if( !(l1.next == null && l2.next == null && nextCarry == 0)){
        		/*** ��Խ���һλ�����޽�λ ***/
        		ListNode next = addTwoNumbers(l1.next, l2.next, nextCarry);
            	if(next != null)
            		r.next = next;
        	}
        	
        }
    	
        return r;
    }
}
