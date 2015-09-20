package poj.part1;

import java.util.Scanner;

public class Poj1006 {

	public static void main(String[] args) {
//		genPara();
		Scanner sc = new Scanner(System.in);
		int c = 0;
		while (true) {
			c++;
			int p = sc.nextInt();
			int e = sc.nextInt();
			int i = sc.nextInt();
			int d = sc.nextInt();
			if (p == -1 && e== -1 && i == -1 && d == -1)
				break;
			int ans = (5544 * p + 14421 * e + 1288 * i-d+21252) % 21252;
			if(ans==0)
				ans=21252;
			System.out.println("Case " + c + ": the next triple peak occurs in " + ans + " days.");
		}
		sc.close();
	}
	
	public static void genPara(){
		int m1 = 23;
		int m2 = 28;
		int m3 = 33;
		int a = 1;
		int b = 1;
		int c =1; 
		int k1 = m2*m3*a;
		int k2 = m1*m3*b;
		int k3 = m1*m2*c;
		for(; a < 23 ; a ++){
			k1 = m2*m3*a;
			if(k1%m1 == 1)
				break;
		}
		for(; b < 28 ; b ++){
			k2 = m1*m3*b;
			if(k2%m2 == 1)
				break;
		}
		for(; c < 33 ; c ++){
			k3 = m1*m2*c;
			if(k3%m3 == 1)
				break;
		}
		System.out.println("k1:"+k1);
		System.out.println("k2:"+k2);
		System.out.println("k3:"+k3);
	}
}
