package leetcode.algorithms.easy;

import java.util.HashSet;

public class Q217 {
	/*** Contains Duplicate ***/
	
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums){
        	if(set.contains(num))
        		return true;
        	else{
        		set.add(num);
        	}
        }
        return false;
    }
}
