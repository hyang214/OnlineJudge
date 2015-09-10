package bestcoder.part1;

import java.util.Scanner;

/**
 * author: Hao 
 * date:2015年9月10日
 * time:下午1:52:04
 * purpose:
 */
public class T1032 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int a1 = a;
			int b1 = b;
			if(a > b){
				int t = a;
				a = b;
				b = t;
			}
			System.out.println(a1+" "+b1+" "+maxCycle(a,b));
		}
		sc.close();
	}

	private static int maxCycle(int a, int b) {
		int maxCycle = Integer.MIN_VALUE;
		for(int i = a ; i <= b ; i ++){
			int cycle = cycle(i);
			if(cycle > maxCycle){
				maxCycle = cycle;
			}
		}
		return maxCycle;
	}

	private static int cycle(int n) {
		int count = 1;
		while(n != 1){
			if(n % 2 == 1){
				n = 3 * n + 1;
			}else{
				n = n / 2;
			}
			count ++;
		}
		return count;
	}
}
