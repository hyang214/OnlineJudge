package leetcode.easy;
/***
 author:  hyang
 date:	  Sep 20, 2015
 time:	  4:46:07 PM
 purpose: Ugly Number
 ***/
public class Q263 {
	public boolean isUgly(int num) {
		if(num < 1)
			return false;
		else if(num == 1)
			return true;
		
		while(num != 1){
			if(num % 2 == 0){
				num = num/2;
			}else if(num % 3 == 0){
				num = num/3;
			}else if(num % 5 == 0){
				num = num/5;
			}else{
				return false;
			}
		}
		return true;
	}
}
