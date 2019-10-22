package leetcode.medium;

import com.fasterxml.jackson.databind.util.LinkedNode;
import leetcode.easy.Q0001;
import leetcode.util.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.10.23
 */
public class Q0002Test {

    @Test
    public void test001() {
        Q0002 solution = new Q0002();
        ListNode l1 = ListNode.build(null);
        ListNode l2 = ListNode.build(null);
        ListNode result = solution.addTwoNumbers(l1, l2);
        ListNode excepted = ListNode.build(null);
        System.out.println(result);
        System.out.println(excepted);
        Assert.assertEquals(true, ListNode.equals(result, excepted));
    }

    @Test
    public void test002() {
        Q0002 solution = new Q0002();
        ListNode l1 = ListNode.build(new int[] {1, 3, 2});
        ListNode l2 = ListNode.build(null);
        ListNode result = solution.addTwoNumbers(l1, l2);
        ListNode excepted = ListNode.build(new int[] {1, 3, 2});
        System.out.println(result);
        System.out.println(excepted);
        Assert.assertEquals(true, ListNode.equals(result, excepted));
    }

    @Test
    public void test003() {
        Q0002 solution = new Q0002();
        ListNode l1 = ListNode.build(null);
        ListNode l2 = ListNode.build(new int[] {3, 8, 7});
        ListNode result = solution.addTwoNumbers(l1, l2);
        ListNode excepted = ListNode.build(new int[] {3, 8, 7});
        System.out.println(result);
        System.out.println(excepted);
        Assert.assertEquals(true, ListNode.equals(result, excepted));
    }

    @Test
    public void test004() {
        Q0002 solution = new Q0002();
        ListNode l1 = ListNode.build(new int[] {2, 4, 3});
        ListNode l2 = ListNode.build(new int[] {5, 6, 4});
        ListNode result = solution.addTwoNumbers(l1, l2);
        ListNode excepted = ListNode.build(new int[] {7, 0, 8});
        System.out.println(result);
        System.out.println(excepted);
        Assert.assertEquals(true, ListNode.equals(result, excepted));
    }

    @Test
    public void test005() {
        Q0002 solution = new Q0002();
        ListNode l1 = ListNode.build(new int[] {2, 4, 5});
        ListNode l2 = ListNode.build(new int[] {5, 6, 4});
        ListNode result = solution.addTwoNumbers(l1, l2);
        ListNode excepted = ListNode.build(new int[] {7, 0, 0, 1});
        System.out.println(result);
        System.out.println(excepted);
        Assert.assertEquals(true, ListNode.equals(result, excepted));
    }

    @Test
    public void test006() {
        Q0002 solution = new Q0002();
        ListNode l1 = ListNode.build(new int[] {2, 4});
        ListNode l2 = ListNode.build(new int[] {5, 6, 4});
        ListNode result = solution.addTwoNumbers(l1, l2);
        ListNode excepted = ListNode.build(new int[] {7, 0, 5});
        System.out.println(result);
        System.out.println(excepted);
        Assert.assertEquals(true, ListNode.equals(result, excepted));
    }
}
