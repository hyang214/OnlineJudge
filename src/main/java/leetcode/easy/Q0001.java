package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * title: Two Sum
 *
 * @author Hao YANG
 * @since 2019.10.20
 */
public class Q0001 {

    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i ++) {
            Integer v = map.get(nums[i]);
            if (v != null) {
                return new int[]{v, i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return null;
    }

}
