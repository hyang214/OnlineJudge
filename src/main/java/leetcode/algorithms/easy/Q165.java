package leetcode.algorithms.easy;

public class Q165 {
    /*** Compare Version Numbers ***/
	
    public int compareVersion(String version1, String version2) {
        String[] o1 = version1.split("\\.");
        String[] o2 = version2.split("\\.");
        
       for(int i = 0 ; i < (o1.length < o2.length ? o2.length : o1.length) ; i ++){
        	int v1 = getChildVersion(o1, i);
        	int v2 = getChildVersion(o2, i);
        	if(v1 > v2)
        		return 1;
        	else if(v1 < v2)
        		return -1;	
        }
        
        return 0;
    }
    
    private int getChildVersion(String[] s, int i){
    	if(i < s.length){
    		return  Integer.valueOf(s[i]);
    	}else
    		return 0;
    }
}
