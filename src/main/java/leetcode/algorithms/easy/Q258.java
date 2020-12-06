package leetcode.algorithms.easy;
/**
 * author: Hao 
 * date:Sep 15, 2015
 * time:9:04:48 AM
 * purpose: Add Digits
 */
public class Q258 {
    public int addDigits(int num) {
        if(num < 10)
        	return num;
        else{
        	int sum = 0;
        	String numS = num + "";
        	for(char c : numS.toCharArray()){
        		sum += c - '0';
        	}
        	return addDigits(sum);
        }
    }
}
