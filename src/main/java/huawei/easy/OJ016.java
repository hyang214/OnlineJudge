package huawei.easy;

import java.util.Scanner;

//Êý×Öµßµ¹
public class OJ016 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	StringBuffer sb = new StringBuffer(tmp);
		 	sb = sb.reverse();
		 	System.out.print(sb.toString());
		 	sc.close();
	 }
}
