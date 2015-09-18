package bestcoder.part1;

import java.util.Scanner;

/***
 author:  hyang
 date:	  Sep 18, 2015
 time:	  10:27:11 AM
 purpose: Safecracker
 ***/
public class T1015 {
	/*** naive ***/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String tmp = sc.nextLine();
			String[] tmps = tmp.split(" ");
			int target = Integer.valueOf(tmps[0]);
			String str = tmps[1];
			if(target == 0 && str.equals("END"))
				break;
			else
				check(target, str);
		}
		sc.close();
	}

	private static void check(int target, String str) {
		for(int v = str.length() ; v > 0 ; v --){
			for(int w = str.length() ; w > 0 ; w --){
				if(v != w){
					for(int x = str.length() ; x > 0 ; x --){
						if(v != x && w != x){
							for(int y = str.length() ; y > 0 ; y --){
								if(v != y && w != y && x != y){
									for(int z = str.length() ; z > 0 ; z --){
										if(v != z && w != z && x != z && y != z){
											int vInt = str.charAt(v-1) - 'A' + 1;
											int wInt = str.charAt(w-1) - 'A' + 1;
											int xInt = str.charAt(x-1) - 'A' + 1;
											int yInt = str.charAt(y-1) - 'A' + 1;
											int zInt = str.charAt(z-1) - 'A' + 1;
											if(vInt-wInt*wInt+xInt*xInt*xInt-yInt*yInt*yInt*yInt+zInt*zInt*zInt*zInt*zInt == target){
												StringBuffer sb = new StringBuffer();
												sb.append(str.charAt(v-1));
												sb.append(str.charAt(w-1));
												sb.append(str.charAt(x-1));
												sb.append(str.charAt(y-1));
												sb.append(str.charAt(z-1));
												System.out.println(sb.toString().toCharArray());
												return;
											} 
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("no solution");
	}
	
	
}
