package leetcode.algorithms.easy;
/***
 author:  hyang
 date:	  Sep 20, 2015
 time:	  3:28:50 PM
 purpose: Happy Number		
 ***/
public class Q202 {
	public boolean isHappy(int n) {
        if(n == 4)
        	return false;
        else if(n == 1)
        	return true;
        else{
        	String str = n +"";
        	int sum = 0;
        	for(char c: str.toCharArray()){
        		sum += Math.pow((c-'0'), 2);
        	}
        	return isHappy(sum);
        }
    }
}
