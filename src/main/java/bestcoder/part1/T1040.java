package bestcoder.part1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * author: Hao 
 * date:2015年9月10日
 * time:下午1:52:04
 * purpose:
 */
public class T1040 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int k = 1; k <= N ; k ++){
			int len = sc.nextInt();
			int[] data = new int[len];
			for(int i = 0 ; i < len ; i ++){
				data[i] = sc.nextInt();
			}
			Arrays.sort(data);
			StringBuffer sb = new StringBuffer();
			for(int v : data){
				sb.append(v+" ");
			}
			sb = sb.deleteCharAt(sb.length()-1);
			System.out.println(sb.toString());
		}
		sc.close();
	}
}
