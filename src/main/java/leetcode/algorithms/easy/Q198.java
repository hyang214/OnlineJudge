package leetcode.algorithms.easy;
/***
 author:  hyang
 date:	  Sep 21, 2015
 time:	  3:06:13 PM
 purpose: House Robber
 ***/
public class Q198 {
	public int rob(int[] nums) {
        if(nums.length == 0)
        	return 0;
        else if(nums.length == 1)
        	return nums[0];
        else if(nums.length == 2)
        	return Math.max(nums[0], nums[1]);
        else{
            nums[1] = Math.max(nums[0], nums[1]);
        	for(int i=2;i<nums.length;i++){
        		nums[i] = Math.max(nums[i]+nums[i-2], nums[i-1]);
        	}
        	return nums[nums.length-1];
        }
    }
}
