package leetcode.algorithms.easy;

public class Q169 {
    public int majorityElement(int[] nums) {
        int mec = 0;
    	int mc = Integer.MIN_VALUE;
    	for(int i = 0 ; i < nums.length ;i ++){
    		if(mec == 0){
    			mc = nums[i];
    			mec ++;
    		}
    		else if(mc != nums[i]){
    			mec --;
    		}
    		else if(mc == nums[i]){
    			mec ++;
    		}
    	}
    	
    	return mc;
    }
}
