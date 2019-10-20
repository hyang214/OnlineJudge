package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.10.20
 */
public class Q0001Test {

    @Test
    public void test() {
        Q0001 solution = new Q0001();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);
    }
}
