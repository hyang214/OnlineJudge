package leetcode.easy;

import java.util.HashMap;

/**
 * author: Hao 
 * date:Sep 16, 2015
 * time:2:30:46 PM
 * purpose:	Roman to Integer
 */
public class Q013 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        char[] list = s.toCharArray();
        for(int i = 0; i < list.length - 1; i++){
        	for(int j = i +1 ; j < list.length; j ++){
        		if(map.get(list[i]) < map.get(list[j])){
        			sum -= map.get(list[i]);
        			break;
        		}
        		else if(map.get(list[i]) > map.get(list[j])){
        			sum += map.get(list[i]);
        			break;
        		}
        		if(j == list.length - 1){
        			sum += map.get(list[i]);
        			break;
        		}
        	}
        }
        sum += map.get(list[list.length-1]);
        
        return sum;
    }
}
