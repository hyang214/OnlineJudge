package leetcode.easy;

import java.util.HashMap;

public class Q003 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int start = 0;
        int max = 0;
        for(int i = 0 ; i < s.length() ; i ++){
        	char key = s.charAt(i);
        	if(!map.containsKey(key)){
        		map.put(key, i);
        	}else{
        		int len = i - start;
        		if(max < len){
        			max = len;
        		}
        		int previous = start;
        		start = map.get(key) + 1;
        		clearMap(map, s.substring(previous, start));
        		map.put(key, i);
        	}
        }
        int len = s.length() - start;
        if(max < len){
			max = len;
		}
        
//        System.out.println(max);
    	return max;
    }
    
    public void clearMap(HashMap<Character,Integer> map, String removeS){
    	for(int i = 0 ; i < removeS.length() ; i ++){
    		map.remove(removeS.charAt(i));
    	}
    }
}
