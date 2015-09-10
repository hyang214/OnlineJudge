package bestcoder.part1;

import java.util.Scanner;

/**
 * author: Hao 
 * date:2015年9月10日
 * time:下午1:52:04
 * purpose:
 */
public class T1003 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int k = 1; k <= N ; k ++){
			int len = sc.nextInt();
			int[] data = new int[len];
			for(int i = 0 ; i < len ; i ++){
				data[i] = sc.nextInt();
			}
			
//			method1(len,data,k);
			
			dp_method(len,data,k);
			if(k != N)
				System.out.println();
		}
		sc.close();
	}

	private static void dp_method(int len, int[] data, int k) {
		int[] sum = new int[len];
		int[] indexs = new int[len];
		sum[0] = data[0];
		indexs[0] = 1;
		int max = data[0];
		int b = 1;
		for(int i = 1; i < len ; i ++){
			if(sum[i-1] >= 0){
				sum[i] = data[i] + sum[i-1];
				indexs[i] = indexs[i-1];
			}else{
				sum[i] = data[i];
				indexs[i] = i+1;
			}
			if(sum[i] > max){
				max = sum[i];
				b = i+1;
			}
		}
		
		System.out.println("Case "+k+":");
		System.out.println(max + " " + indexs[b-1] + " " + b);
	}

//	private static void method1(int len, int[] data, int k) {
//		int max  = Integer.MIN_VALUE ;
//		int a = -1;
//		int b = -1;
//		for(int start = 0 ; start < len ; start ++){
//			for(int end = start+1 ; end < len ; end ++){
//				int sum = 0;
//				for(int i = start ; i < end ; i ++){
//					sum += data[i];
//				}
//				if(sum > max){
//					max = sum;
//					a = start + 1;
//					b = end;
//				}
//			}
//		}
//		
//		System.out.println("Case "+k+":");
//		System.out.println(max + " " + a + " " + b);
//		System.out.println();
//	}
}
