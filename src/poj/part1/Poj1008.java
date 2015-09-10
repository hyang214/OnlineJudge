package poj.part1;

import java.util.Scanner;

public class Poj1008 {

	public static void main(String[] args) {
		String[] habb = {"pop", "no", "zip", "zotz", "tzec", "xul", "yoxkin", "mol", "chen", "yax", "zac", "ceh", "mac", "kankin", "muan", "pax", "koyab", "cumhu"};
	    String[] tzolkin = {"imix", "ik", "akbal", "kan", "chicchan", "cimi", "manik", "lamat", "muluk", "ok", "chuen", "eb", "ben", "ix", "mem", "cib", "caban", "eznab", "canac", "ahau"};
	        
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		
		System.out.println(n);
		
		for(int i = 0 ; i < n ; i ++){
			String tmp = sc.nextLine();
			String[] ss = tmp.split(" ");
			int hDay = Integer.parseInt(ss[0].substring(0, ss[0].length()-1));
			String hMonthS = ss[1];
			int hMonth;
			for(hMonth = 0; hMonth < habb.length; hMonth ++){
	              if(hMonthS.equals(habb[hMonth])){
	                  break;
	              }
	        }
			int hYear = Integer.parseInt(ss[2]);
			int sumDay = hYear * 365 + hMonth * 20 + hDay;
			
			int tYear = sumDay / 260;
			String tMonth = tzolkin[sumDay % 260 % 20];
			int tDay = sumDay % 260 % 13 + 1;
			System.out.println(tDay+" "+tMonth+" "+tYear);
		}
		sc.close();
	}
}
/*
 * 4
10. zac 0
10. zac 0
0. pop 0
10. zac 1995
*/