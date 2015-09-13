package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

public class Q205 {
    /*** Isomorphic Strings ***/
	
    public boolean isIsomorphic(String s, String t) {
        HashMap<String, String> map = new HashMap<String, String>();
        HashSet<String> set = new HashSet<String>();
        if(s.length() != t.length())
        	return false;
        else{
        	String[] ss = s.split("");
        	String[] tt = t.split("");
        	for(int i = 0 ; i < ss.length ; i ++){
        		String r = map.get(ss[i]);
        		if(r == null){
        			if(set.contains(tt[i]))
        				return false;
        			map.put(ss[i], tt[i]);
        			set.add(tt[i]);
        		}else{
        			if(!r.equals(tt[i]))
        				return false;
        		}
        	}
        }
        return true;
    }
}
