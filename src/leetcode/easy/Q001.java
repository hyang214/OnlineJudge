package leetcode.easy;

import java.util.HashMap;

public class Q001 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length ; i ++){
            if(map.containsKey(nums[i])){
            	return new int[] {map.get(nums[i]),i+1};
            }else{
            	int res = target - nums[i];
                map.put(res, i+1);
            }
        }
        return null;
    }
}
