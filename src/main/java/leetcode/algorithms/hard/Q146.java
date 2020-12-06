package leetcode.algorithms.hard;

import java.util.LinkedHashMap;

/***
 author:  hyang
 date:	  Sep 18, 2015
 time:	  11:27:44 PM
 purpose: LRU Cache
 ***/
public class Q146 {
	
	/*** naive method, LTE! ***/
//	private HashMap<Integer, Integer> map;
//	private int capacity;
//	private Queue<Integer> queue;
//	public Q146(int capacity) {
//        this.map = new HashMap<Integer, Integer>();
//        this.capacity = capacity;
//        this.queue = new LinkedList<Integer>();
//    }
//    
//    public int get(int key) {
//        if(map.containsKey(key)){
//        	queue.remove(key);
//        	queue.add(key);
//        	return map.get(key);
//        }else
//        	return -1;
//    }
//    
//    public void set(int key, int value) {
//
//        if(map.size() < capacity){
//        	queue.add(key);
//        	map.put(key, value);
//        }else{
//        	int removed = queue.poll();
//        	map.remove(removed);
//        	queue.add(key);
//        	map.put(key, value);
//        }
//    }
	
	private LinkedHashMap<Integer, Integer> map;
    private int capacity;

    public Q146(int capacity) {
    	//set access order to true, the default order is insert order
    	map = new LinkedHashMap<Integer, Integer>(capacity, 1, true); 
    	this.capacity = capacity;
    }

    public int get(int key) {
    	if (!map.containsKey(key)) 
    		return -1;
    	return map.get(key);
    }

    public void set(int key, int value) {
    	if (!map.containsKey(key) && (map.size() == capacity)) {
    		map.remove(map.keySet().iterator().next());
    	}
    	map.put(key, value);
  	}
    
    public static void main(String[] args) {
		Q146 q146 = new Q146(2);
		q146.set(2, 1);
		q146.set(1, 1);
		q146.get(2);
		q146.set(4, 1);
		q146.get(1);
		q146.get(2);
	}
}
