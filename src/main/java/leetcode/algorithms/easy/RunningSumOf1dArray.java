package leetcode.algorithms.easy;

/**
 * title: 1480. Running Sum of 1d Array
 *  https://leetcode.com/problems/running-sum-of-1d-array
 *
 * @author Hao YANG
 * @since 2020.12.13
 */
public class RunningSumOf1dArray {

    public interface Approach {
        int[] runningSum(int[] nums);
    }

    public static class SimpleApproach implements Approach {

        @Override
        public int[] runningSum(int[] nums) {
            if (nums == null) {
                return null;
            }
            if (nums.length == 0) {
                return new int[0];
            }
            for (int i = 1; i < nums.length; i ++) {
                nums[i] = nums[i] + nums[i-1];
            }
            return nums;
        }

    }

}
