package leetcode.hard;

import java.util.ArrayList;
import java.util.Comparator;

public class Q004 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	double median = 0;
    	
        int m = nums1.length;
        int n = nums2.length;
        int size = m + n;
        boolean needTwo = size%2 == 0?true:false;
        int leftSize;
        if(needTwo){
        	leftSize = size / 2 - 1;
        }else{
        	leftSize = size / 2;
        }
        
        int i = 0;
        int j = 0;
        int count = 0;
        
        boolean both = true;
        while(count < leftSize || nums1.length == 0 || nums2.length == 0){
        	 if(i == nums1.length){
	       		 int other = leftSize - count;
	       		 j = j + other;
	       		 if(needTwo){
	       			 median = (double)(nums2[j] + nums2[j+1])/2;
	       		 }else{
	       			 median = nums2[j];
	       		 }
	       		 both = false;
	       		 return median;
	       	 }else if(j == nums2.length){
	       		 int other = leftSize - count;
	       		 i = i + other;
	       		 if(needTwo){
	       			 median = (double)(nums1[i] + nums1[i+1])/2;
	       		 }else{
	       			 median = nums1[i];
	       		 }
	       		 both = false;
	       		 return median;
	       	 }
        	
        	 if(nums1[i] < nums2[j]){
        		 i++;        		
        	 }else{
        		 j++;
        	 }
        	 count++;
        	 
        }
        
        if(both){
        	if(needTwo){
             	median = getMedianOfTwo(nums1, nums2, i, j);
        	}else{
        		median = getMedianOfOne(nums1, nums2, i, j);
        	}
        }
        
//        System.out.println(median);
        
    	return median;
    }
    
    private double getMedianOfTwo(int[] nums1, int[] nums2, int i, int j){
    	ArrayList<Integer> gets = new ArrayList<Integer>();
    	for(int ii = i; ii < nums1.length && ii < i + 2; ii ++){
    		gets.add(nums1[ii]);
    	}
    	for(int jj = j; jj < nums2.length && jj < j + 2; jj ++){
    		gets.add(nums2[jj]);
    	}
    	gets.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2)
					return -1;
				else
					return 1;
			}
		});
    	
    	return (double)(gets.get(0) + gets.get(1))/2;
    }
    
    private double getMedianOfOne(int[] nums1, int[] nums2, int i, int j){
    	ArrayList<Integer> gets = new ArrayList<Integer>();
    	for(int ii = i; ii < nums1.length && ii < i + 1; ii ++){
    		gets.add(nums1[ii]);
    	}
    	for(int jj = j; jj < nums2.length && jj < j + 1; jj ++){
    		gets.add(nums2[jj]);
    	}
    	gets.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2)
					return -1;
				else
					return 1;
			}
		});
    	
    	return gets.get(0);
    }
}
