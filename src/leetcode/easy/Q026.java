package leetcode.easy;

import java.util.HashSet;

/***
 author:  hyang
 date:	  Sep 20, 2015
 time:	  6:13:44 PM
 purpose: Remove Duplicates from Sorted Array
 ***/
public class Q026 {
	public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int now = 0;
        for(int i = 0 ; i < nums.length ; i ++){
        	if(!set.contains(nums[i])){
        		nums[now] = nums[i];
        		now++;
        		set.add(nums[i]);
        	}
        }
        return now;
    }
}
