package huawei.easy;

import java.util.Scanner;

//¾ä×ÓÄæÐò
public class OJ021 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	String[] tmps = tmp.split(" ");
		 	StringBuffer sb = new StringBuffer();
		 	for(int i = tmps.length-1; i > -1  ; i --){
		 		sb.append(tmps[i]+" ");
		 	}
		 	sb = sb.deleteCharAt(sb.length() - 1);
		 	System.out.println(sb.toString());
		 	sc.close();
	 }
}
