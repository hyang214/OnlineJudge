package huawei.easy;

import java.util.Scanner;

//ºÏ·¨IP
public class OJ022 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	sc.close();
		 	
		 	if(tmp.equals("") || tmp == null){
		 		System.out.println("NO");
		 		return;
		 	}
		 	
		 	String[] vs = tmp.split("\\.");
		 	if(vs.length != 4){
		 		System.out.println("NO");
		 		return;
		 	}
		 	
		 	for(int i = 0 ; i < vs.length ; i ++){
		 		try {
					int vv = Integer.valueOf(vs[i]);
					if(vv < 0 || vv > 255){
						System.out.println("NO");
						return;
					}
				} catch (Exception e) {
					System.out.println("NO");
					return;
				}
		 	}
		 	System.out.println("YES");
	 }
}
