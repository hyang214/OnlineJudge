package leetcode.easy;
/**
 * author: Hao 
 * date:Sep 14, 2015
 * time:7:53:22 PM
 * purpose: Number of 1 Bits
 */
public class Q191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String nBit = Integer.toBinaryString(n);
        int count = 0;
        for(char c : nBit.toCharArray()){
        	if(c == '1')
        		count++;
        }
        return count;
    }
}
