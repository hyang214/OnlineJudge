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
        return Math.abs(res - Math.round(res)) < 0.0000000001;
    }
    
    public boolean isPowerOfThree01(int n) {
    	if(0 == n)
            return false;
        double res = Math.log10(n)/Math.log10(3);
        return Math.floor(res) == Math.ceil(res);
    }
    
    /** the best method I have seen **/
    public boolean isPowerOfThree02(int n) {
    	// 1162261467 is 3^19,  3^20 is bigger than int  
	    return ( n>0 &&  1162261467%n==0);
    }
    
    public static void main(String[] args) {
		Q326 q326 = new Q326();
		q326.isPowerOfThree(243);
		double d1 = 0.1;
		d1 += 0.1;d1 += 0.1;d1 += 0.1;d1 += 0.1;d1 += 0.1;d1 += 0.1;d1 += 0.1;d1 += 0.1; // 连着加了8次
		System.out.println(d1);  
	}
}
