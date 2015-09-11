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
		while(sc.hasNext()){
			int n = sc.nextInt();
			exception(n);
		}
		
		sc.close();
	}

	private static void exception(int n) {
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
			for(long i = 2; i <= Math.sqrt(son) ; i ++){
				if(son % i == 0 && mother % i == 0){
					son /= i;
					mother /= i;
					flag = true;
					i += Math.sqrt(son);
				}
			}
		}
		
		String iS = integer+"";
		String sS = son + "";
		String mS = mother + "";
		
		if(son != 0){
			System.out.println(getChars(iS.length()+1, ' ') + sS);
			System.out.println(iS+" "+getChars(mS.length(), '-'));
			System.out.println(getChars(iS.length()+1, ' ') + mS);
		}else{
			System.out.println(iS);
		}
			
	}

	private static String getChars(int k, char c) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < k ; i ++){
			sb.append(c);
		}
		return sb.toString();
	}
}
