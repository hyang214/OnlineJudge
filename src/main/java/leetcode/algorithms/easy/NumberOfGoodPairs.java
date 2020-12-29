package leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * title:   1512. Number of Good Pairs
 *      https://leetcode.com/problems/number-of-good-pairs
 *
 * @author Hao YANG
 * @since 2020.12.24
 */
public class NumberOfGoodPairs {

    public interface Approach {
        int numIdenticalPairs(int[] nums);
    }

    /**
     * 基于组合可能性的计算
     * 问题可以抽象为：
     *  一个序列里面有多少个相同值，每个出现多少次；
     *  对于一个出现了n次的相同值，其能构成的偏序对，为 (n * (n - 1))/2
     */
    public static class CombineCalcApproach implements Approach {

        @Override
        public int numIdenticalPairs(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i ++) {
                if (map.containsKey(nums[i])) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                } else {
                    map.put(nums[i], 1);
                }
            }
            int sum = 0;
            for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                if (entry.getValue() < 2) {
                    continue;
                }
                sum += (entry.getValue() * (entry.getValue() - 1)) / 2;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(new NumberOfGoodPairs.CombineCalcApproach().numIdenticalPairs(nums));
    }

}
