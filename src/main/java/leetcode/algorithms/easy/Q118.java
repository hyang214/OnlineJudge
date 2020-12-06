package leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class Q118 {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> allList = new ArrayList<List<Integer>>();
    	for(int layer = 0 ; layer < numRows ; layer ++){
    		List<Integer> layerList = new ArrayList<Integer>();
    		for(int index = 0 ; index < layer+1 ; index ++){
    			int left = getNumber(layer-1, index-1, allList);
    			int right = getNumber(layer-1, index, allList);
    			layerList.add(left+right);
    		}
    		allList.add(layerList);
    	}
    	return allList;
    }
    
    private int getNumber(int layer, int index, List<List<Integer>> allList){
    	
    	if(layer == -1 && index == 0){
    		return 1;
    	}else if(index < 0){
    		return 0;
    	}else if(index == layer+1)
    		return 0;
    	else{
    		return allList.get(layer).get(index);
    	}
    }
}
