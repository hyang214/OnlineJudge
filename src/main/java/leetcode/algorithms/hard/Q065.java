package leetcode.algorithms.hard;
/***
 author:  hyang
 date:	  Sep 19, 2015
 time:	  11:20:43 AM
 purpose: Valid Number
 ***/
public class Q065 {
	   public boolean isNumber(String s) {
	        try {
	        Double.parseDouble(s);
	        } catch(Exception e) {
	            return false;
	        }
	        if(s.charAt(s.length()-1)=='D' || s.charAt(s.length()-1)=='d' || s.charAt(s.length()-1)=='f' || s.charAt(s.length()-1)=='F') 
	            return false;
	        return true;
	    }
}
