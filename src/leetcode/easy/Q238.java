package leetcode.easy;
/***
 author:  hyang
 date:	  Sep 17, 2015
 time:	  7:45:11 PM
 purpose: Product of Array Except Self
 ***/	
public class Q238 {
	public int[] productExceptSelf(int[] nums) {
        int product = 1;
        for(int num : nums){
        	if(num == 0)
        		return new int[nums.length];
        	product *= num;
        }
        for(int i = 0 ; i < nums.length - 1 ; i ++){
        	nums[i] = product / nums[i];
        }
        return nums;
    }
}
