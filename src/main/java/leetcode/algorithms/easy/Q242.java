package leetcode.algorithms.easy;

import java.util.HashMap;

public class Q242 {
    public boolean isAnagram(String s, String t) {
        
    	HashMap<String, Integer> sMap = mapCount(s);    	
    	HashMap<String, Integer> tMap = mapCount(t); 
    	
    	boolean equal = equal(sMap,tMap);
    	
    	return equal;
    }

	private boolean equal(HashMap<String, Integer> sMap,
			HashMap<String, Integer> tMap) {
		if(sMap.size() == tMap.size()){
			for(String c: sMap.keySet()){
				if(!sMap.get(c).equals(tMap.get(c)))
					return false;
			}
			return true;
		}
			
		return false;
	}

	private HashMap<String, Integer> mapCount(String s) {
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		
		String[] splits = s.split("");
		for(String c : splits){
			Integer count = map.get(c);
			if(count == null){
				count = new Integer(1);
			}else{
				count = count + 1;
			}
			map.put(c, count);
		}
		
		return map;
	}
}
