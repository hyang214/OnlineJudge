package leetcode.easy;

public class Q171 {
	/*** Excel Sheet Column Number ***/
	
    public int titleToNumber(String s) {
    	
    	int number = 0;
        for(int i = 0 ; i < s.length() ; i ++){
        	int one = s.charAt(i) - 'A' + 1;
        	int base = base(i, s.length());
        	number += one * base;
        }
        
        return number;
    }

	private int base(int i, int length) {
		int o = length - i - 1;
		return (int)Math.pow(26, o);
	}
}
