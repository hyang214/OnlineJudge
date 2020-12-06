package leetcode.algorithms.medium;
/**
 * author: Hao 
 * date:Sep 15, 2015
 * time:9:58:17 AM
 * purpose:	Single Number
 */
public class Q136 {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++)
            res = res ^ nums[i];

        return res;
    }
}
