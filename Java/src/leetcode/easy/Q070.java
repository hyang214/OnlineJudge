package leetcode.easy;
/**
 **author:	yangh
 **date:	Sep 16, 2015
 **time:	12:05:05 AM
 **use:		Climbing Stairs
 */
public class Q070 {
	
    public int climbStairs(int n) {
    	if(n == 1)
    		return 1;
    	else if(n == 2)
    		return 2;
    	else{
    		int[] steps = new int[n];
    		steps[0] = 1;
    		steps[1] = 2;
    		
    		for(int i = 2 ; i < n ; i ++){
    			steps[i] = steps[i-1] + steps[i-2];
    		}
    		return steps[n-1];
    	}
    }
    
	/*** Time Limit Exceeded ***/
//    public int climbStairs(int n) {
//        if(n  == 2 || n == 1)
//        	return 1;
//        else{
//        	return climbStairs(n-1) + climbStairs(n-2);
//        }
//    }
}

