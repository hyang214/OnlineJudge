package leetcode.algorithms.easy;
/**
 * author: Hao 
 * date:2015��8��7��
 * time:����9:33:05
 * purpose:
 */
public class Q231 {
	/*** Power of Two  ***/
	
    public boolean isPowerOfTwo(int n) {
    	return n > 0 && ((n & (n - 1)) == 0 );  
    }
}
