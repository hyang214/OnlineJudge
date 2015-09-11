package bestcoder.part1;

import java.util.Scanner;

/**
 * author: Hao 
 * date:Sep 11, 2015
 * time:2:14:52 PM
 * purpose:
 */
public class T1099 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[][] results = new long[22][3];
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(results[n-1][0] == 0){
				exception(n, results);
				print(results[n-1][0], results[n-1][1], results[n-1][2]);
			}
			else{
				print(results[n-1][0], results[n-1][1], results[n-1][2]);
			}
		}
		
		sc.close();
	}

	private static void exception(int n, long[][] results) {
		long integer = 0;
		long son = 0;
		long mother = 1;
		
		for(int i = n ; i > 0 ; i --){
			son = son * i + mother * 1;
			mother = mother * i;
			if(son >= mother){
				integer += son / mother;
				son = son % mother;
			}
			
			boolean flag = true;
			while(flag){
				flag = false;
				for(long j = 2; j <= son ; j ++){
					if(son % j == 0 && mother % j == 0){
						son /= j;
						mother /= j;
						flag = true;
						j += Math.sqrt(son);
					}
				}
			}
		}
		
		integer *= n;
		son *= n;
		if(son >= mother){
			integer += son / mother;
			son = son % mother;
		}
		
		boolean flag = true;
		while(flag){
			flag = false;
			for(long j = 2; j <= son ; j ++){
				if(son % j == 0 && mother % j == 0){
					son /= j;
					mother /= j;
					flag = true;
					j += Math.sqrt(son);
				}
			}
		}
		
		results[n-1][0] = integer;
		results[n-1][1] = son;
		results[n-1][2] = mother;
	}

	private static String getChars(int k, char c) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < k ; i ++){
			sb.append(c);
		}
		return sb.toString();
	}
	
	private static void print(long integer, long son, long mother){
		String iS = integer+"";
		String sS = son + "";
		String mS = mother + "";
		
		if(son != 0){
			System.out.println(getChars(iS.length()+1, ' ') + son);
			System.out.println(integer+" "+getChars(mS.length(), '-'));
			System.out.println(getChars(iS.length()+1, ' ') + mother);
		}else{
			System.out.println(iS);
		}
	}
}
