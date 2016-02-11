package leetcode.easy;

/**
 author: hyang
 date: Feb 11, 2016
 time: 1:12:01 PM
 purpose: Power of Three
**/
public class Q326 {
    public boolean isPowerOfThree(int n) {
    	if(0 == n)
            return false;
        double res = Math.log(n)/Math.log(3);
        /** error if n = 243, since the res will be 4.999999999999999 rather 5 **/
        //return Math.floor(res) == Math.ceil(res);
        /** in order to judge that tow double values are equal or not, we cannot use '==', 
         * we should use |a - b| < Math.e **/
        double d = Math.abs(res - Math.round(res));
        return d < Double.MIN_NORMAL;
    }
    
    public static void main(String[] args) {
		Q326 q326 = new Q326();
		q326.isPowerOfThree(243);
	}
}
