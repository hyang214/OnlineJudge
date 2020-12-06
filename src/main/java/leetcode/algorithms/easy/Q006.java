package leetcode.algorithms.easy;

import java.util.ArrayList;

public class Q006 {
    public String convert(String s, int numRows) {
        int rowNumber = numRows;
    	int diagNumber = rowNumber < 2 ?0:rowNumber - 2;
    	int turnNumber = rowNumber + diagNumber;
    	ArrayList<StringBuffer> list = new ArrayList<StringBuffer>();
    	for(int i = 0 ; i < numRows ; i ++){
    		list.add(new StringBuffer());
    	}
    	
    	String[] words = s.split("");
    	for(int i = 0 ; i < words.length ; i ++){
    		int left = i % turnNumber;
    		if(left < rowNumber){
    			list.get(left).append(words[i]);
    		}else{
    			left = 2 * rowNumber - 2 - left;
        		list.get(left).append(words[i]);
    		}

    	}
    	
    	StringBuffer r = new StringBuffer();
    	for(StringBuffer sb : list){
    		r.append(sb.toString());
    	}
    	
    	return r.toString();
    }
}
