package leetcode.algorithms.easy;
/***
 author:  hyang
 date:	  Sep 19, 2015
 time:	  2:50:55 PM
 purpose: Move Zeros
 ***/
public class Q283 {
	public void moveZeroes(int[] nums) {
        int now = 0;
        int zeros = 0;
        for(int i = 0 ; i < nums.length ; i ++){
        	if(nums[i] == 0)
        		zeros ++;
        	else{
        		nums[now] = nums[i]; 
        		now ++;
        	}
        }
        for(int i = nums.length - zeros ; i < nums.length ; i ++){
        	nums[i] = 0;
        }
    }
}
