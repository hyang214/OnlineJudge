package leetcode.algorithms.medium;

import leetcode.util.ListNode;

/**
 * title: Add Two Numbers
 *
 * @author Hao YANG
 * @since 2019.10.22
 */
public class Q0002 {
	 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	/** 处理单个为null的情况 **/
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}

		ListNode root = new ListNode(0);
		ListNode current = root;
		int plus = 0;
		ListNode l1Current = l1;
		ListNode l2Current = l2;
		while (true) {
			/** 计算当前位值 和 进位 **/
			int l1CurrentVal = l1Current == null ? 0 : l1Current.val;
			int l2CurrentVal = l2Current == null ? 0 : l2Current.val;
			int sum = l1CurrentVal + l2CurrentVal + plus;
			int sumLeft = sum % 10;
			current.val = current.val + sumLeft;
			plus = sum >= 10 ? 1: 0;

			/** 链表向后移动 **/
			if (l1Current != null) {
				l1Current = l1Current.next;
			}
			if (l2Current != null) {
				l2Current = l2Current.next;
			}

			if (l1Current != null || l2Current != null || plus != 0) {
				/** 构建下一个节点 **/
				current.next = new ListNode(0);
				current = current.next;
			} else {
				/** 遍历完成 **/
				break;
			}
		}

		return root;
    }
}
