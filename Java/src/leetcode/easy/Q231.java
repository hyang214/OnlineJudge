package leetcode.easy;
/**
 * author: Hao 
 * date:2015年8月7日
 * time:下午9:33:05
 * purpose:
 */
public class Q231 {
	/*** Power of Two  ***/
	
    public boolean isPowerOfTwo(int n) {
    	return n > 0 && ((n & (n - 1)) == 0 );  
    }
}
