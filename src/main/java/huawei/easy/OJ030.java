package huawei.easy;

import java.util.Scanner;

//求最小公倍数
public class OJ030 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int mc = gcd(a,b);
		System.out.println((a * b) / mc);
	}

	private static int gcd(int a, int b) {
		int r1 = Math.min(a, b);
		int r2 = Math.max(a, b);
		if(r1 == 0)
			return r2;
		return gcd(r1, r2 % r1);
	}
}
