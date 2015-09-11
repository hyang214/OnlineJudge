package bestcoder.part1;

import java.util.Scanner;

/**
 * author: Hao 
 * date:2015年9月11日
 * time:上午10:56:30
 * purpose:
 */
public class T1058 {
	
	public static void main(String[] args) {
		
		int[] list = new int[5850];
		list[0] = 1;
		
		int x2 = 0;
		int x3 = 0;
		int x5 = 0;
		int x7 = 0;
		
		for(int i = 1 ; i < 5842 ; i ++){
			int x2_v = list[x2] * 2;
			int x3_v = list[x3] * 3;
			int x5_v = list[x5] * 5;
			int x7_v = list[x7] * 7;
			
			int min = min_4(x2_v,x3_v,x5_v,x7_v);
			
			if(min == x2_v)
				x2++;
			if(min == x3_v)
				x3++;
			if(min == x5_v)
				x5++;
			if(min == x7_v)
				x7++;
			
			list[i] = min;
		}
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		while(n != 0){
			print(n, list[n-1]);
			n = Integer.valueOf(sc.nextLine());
		}
		sc.close();
	}
	
	
	private static int min_4(int x2_v, int x3_v, int x5_v, int x7_v) {
		int min = x2_v;
		
		if(min > x3_v)
			min = x3_v;
		if(min > x5_v)
			min = x5_v;
		if(min > x7_v)
			min = x7_v;
		
		return min;
	}
	
	private static void print(int n, int value) {
		StringBuffer sb = new StringBuffer();
		sb.append("The "+n);
		if(n % 10 == 1 && n % 100 != 11)
			sb.append("st");
		else if(n % 10 == 2 && n % 100 != 12)
			sb.append("nd");
		else if(n % 10 == 3 && n % 100 != 13)
			sb.append("rd");
		else
			sb.append("th");
		sb.append(" humble number is " + value +".");
		System.out.println(sb.toString());
	}
	
	/*** naive method, too simple to exceed the time limit ***/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int now = 1;
//		int[] list = new int[5842];
//		list[0] = 1;
//		while(sc.hasNext()){
//			int n = sc.nextInt();
//			if(n == 0)
//				break;
//			
//			if(n <= now)
//				print(n,list[n-1]);
//			else{
//				int index = list[now-1]+1;
//				while(now < n){
//					if(isHN(index)){
//						list[now] = index;
//						now++;
//					}
//					index ++;
//				}
//				print(n,list[n-1]);
//			}
//		}
//		sc.close();
//	}
//
//	private static boolean isHN(int index) {
//		ArrayList<Integer> primeFactorList = new ArrayList<Integer>();
//		getPrimeFactor(index, primeFactorList);
//		for(Integer pf: primeFactorList){
//			if(pf != 2 && pf != 3 && pf!= 5 && pf!= 7)
//				return false;
//		}
//		return true;
//	}
//
//
//	private static void getPrimeFactor(int tmp,
//			ArrayList<Integer> primeFactorList) {
//		if(isPrime(tmp))
//			primeFactorList.add(tmp);
//		else{
//			for(int i = 2 ; i < tmp ; i ++){
//				if(tmp % i == 0){
//					getPrimeFactor(i, primeFactorList);
//					getPrimeFactor(tmp / i, primeFactorList);
//					return;
//				}
//			}
//		}
//	}
//
//	private static boolean isPrime(int tmp) {
//		if(tmp == 2)
//			return true;
//		for(int i = 2 ; i <= Math.sqrt(tmp) ; i ++){
//			if(tmp % i == 0)
//				return false;
//		}
//		return true;
//	}
}
