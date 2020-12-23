package leetcode.algorithms.easy;

import leetcode.util.Logger;

/**
 * title: Shuffle the Array
 *      https://leetcode.com/problems/shuffle-the-array
 *
 * @author Hao YANG
 * @since 2020.12.22
 */
public class ShuffleTheArray {


    public interface Approach {

        int[] shuffle(int[] nums, int n);

    }

    /**
     * 简单实现，直接交换
     * 对于x: i -> 2i
     * 对于y: i + n -> 2i + 1
     */
    public static class SimpleApproach implements Approach {

        @Override
        public int[] shuffle(int[] nums, int n) {
            int[] arrays = new int[2 * n];
            for (int i = 0; i < n; i ++) {
                arrays[2 * i] = nums[i];
                arrays[2 * i + 1] = nums[i + n];
            }
            return arrays;
        }

    }

    public static void main(String[] args) {
        ShuffleTheArray.SimpleApproach approach = new ShuffleTheArray.SimpleApproach();
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] arrays = approach.shuffle(nums, n);
        Logger.print(arrays);
    }

}
