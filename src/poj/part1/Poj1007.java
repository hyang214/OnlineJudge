package poj.part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Poj1007 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String p = sc.nextLine();
		String ps[] = p.split(" ");
		int n = Integer.valueOf(ps[0]);
		int m = Integer.valueOf(ps[1]);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int k = 0 ; k < m ; k ++){
			String tmp = sc.nextLine();
			int inversions = 0;
			for(int i = 0 ; i < tmp.length() ; i ++){
				for(int j = i+1; j < tmp.length() ; j ++){
					char a = tmp.charAt(i);
					char b = tmp.charAt(j);
					if(a > b)
						inversions++;
				}
			}
			list.add(inversions);
			map.put(inversions, tmp);
		}
		sc.close();
	    for(int i = 0 ; i < list.size() ; i ++){
	    	for(int j = 0 ; j < list.size() -1 ; j ++){
	    		Integer aV = list.get(j);
	    		Integer bV = list.get(j+1);
	    		if(aV > bV){
	    			list.set(j, bV);
	    			list.set(j+1, aV);
	    		}		
	        }
	    }
		
		for(Integer in : list){
			System.out.println(map.get(in));
		}
	}

}
/*
 * 10 7
AACATGAAGG
AACATGAAGG
TTTTGGCCAA
TTTGGCCAAA
GATCAGATTT
CCCGGGGGGA
ATCGATGCAT
 */
