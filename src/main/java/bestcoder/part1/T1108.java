package bestcoder.part1;

import java.util.Scanner;

/***
 author:  hyang
 date:	  Sep 18, 2015
 time:	  1:50:39 PM
 purpose: 	最小公倍数
 ***/
public class T1108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int gcd = gcd(a,b);
			System.out.println(a / gcd * b);
		}
		sc.close();
	}

	private static int gcd(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		if(min == 0)
			return max;
		else
			return gcd(min, max % min);
	}
	
	
}
