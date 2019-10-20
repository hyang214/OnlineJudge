package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q119 {
    public List<Integer> getRow(int rowIndex) {
        /*** leetcode 上119题 下标是从0开始 ***/
    	rowIndex++;
    	
    	List<List<Integer>> allList = new ArrayList<List<Integer>>();
    	for(int layer = 0 ; layer < rowIndex ; layer ++){
    		List<Integer> layerList = new ArrayList<Integer>();
    		for(int index = 0 ; index < layer+1 ; index ++){
    			int left = getNumber(layer-1, index-1, allList);
    			int right = getNumber(layer-1, index, allList);
    			layerList.add(left+right);
    		}
    		allList.add(layerList);
    		if(allList.size() > 1){
    			allList.set(layer-1, null);
    		}
    	}
    	
    	return allList.get(rowIndex-1);
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
