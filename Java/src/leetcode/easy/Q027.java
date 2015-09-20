package leetcode.easy;
/***
 author:  hyang
 date:	  Sep 20, 2015
 time:	  4:39:30 PM
 purpose: Remove Element
 ***/
public class Q027 {
	public int removeElement(int[] nums, int val) {
        int now = 0;
        for(int i = 0 ; i < nums.length ; i++){
        	if(nums[i] != val){
        		nums[now] = nums[i];
        		now++;
        	}
        }
        return now;
    }
}
