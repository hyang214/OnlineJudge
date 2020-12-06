package leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * author: Hao 
 * date:2015��8��7��
 * time:����9:40:13
 * purpose:
 */
public class Q228 {
	/*** Summary Ranges ***/
	
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        
        if(nums.length == 0)
        	return list;
        
        int start = nums[0];
        for(int i = 1 ; i < nums.length ; i ++){
        	if(nums[i] != nums[i-1] + 1){
        		int end = nums[i-1];
        		if(end != start)
        			list.add(start+"->"+end);
        		else
        			list.add(start+"");
        		start = nums[i];
        	}
        }
        int end = nums[nums.length-1];
		if(end != start)
			list.add(start+"->"+end);
		else
			list.add(start+"");
        
        return list;
    }
}
