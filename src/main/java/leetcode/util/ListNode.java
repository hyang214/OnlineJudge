package leetcode.util;

public class ListNode {
     public int val;
     public ListNode next;
     public ListNode(int x) { val = x; }

     public static ListNode build(int[] args) {
          if (args != null && args.length >= 1) {
               ListNode root = new ListNode(args[0]);
               ListNode before = root;
               for (int i = 1; i < args.length; i ++) {
                    before.next = new ListNode(args[i]);
                    before = before.next;
               }
               return root;
          } else {
               return null;
          }
     }

     public static boolean equals(ListNode l1, ListNode l2) {
          if (l1 == null && l2 == null) {
               return true;
          } else if (l1 != null && l2 != null) {
               if (l1.val != l2.val) {
                    return false;
               } else {
                    return equals(l1.next, l2.next);
               }
          } else {
               return false;
          }
     }

     @Override
     public String toString() {
          StringBuffer sb = new StringBuffer();
          ListNode current = this;
          while(true) {
               sb.append(current.val + " ");
               if (current.next != null) {
                    current = current.next;
               } else {
                    break;
               }
          }
          return sb.toString();
     }
}
