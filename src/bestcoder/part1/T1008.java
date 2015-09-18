package bestcoder.part1;

import java.util.Scanner;

/***
 author:  hyang	
 date:	  Sep 18, 2015
 time:	  1:26:24 PM
 purpose: 	Elevator, accepted
 ***/
public class T1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0)
				break;
			
			int[] floors = new int[n];
			for(int i = 0 ; i < n ; i ++){
				floors[i] = sc.nextInt();
			}
			
			int cost = n * 5 + 6 * floors[0];
			for(int i = 1 ; i < n ; i ++){
				if(floors[i-1] > floors[i]){
					cost += (floors[i-1] - floors[i]) * 4;
				}else{
					cost += (floors[i] - floors[i-1]) * 6;
				}
			}
			System.out.println(cost);
		}
		sc.close();
	}
}
