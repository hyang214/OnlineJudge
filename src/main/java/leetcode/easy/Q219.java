package leetcode.easy;

import java.util.HashMap;

public class Q219 {
	/*** Contains Duplicate II ***/
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length ; i ++){
        	Integer index = map.get(nums[i]);
        	if(index != null && Math.abs(i - index) <= k ){
        		return true;
        	}
        	else{
        		map.put(nums[i], i);
        	}
        }
        return false;
    }
}
