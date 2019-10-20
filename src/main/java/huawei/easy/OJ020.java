package huawei.easy;

import java.util.Scanner;

//×Ö·ûÄæÐò
public class OJ020 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	StringBuffer sb = new StringBuffer(tmp);
		 	sb = sb.reverse();
		 	System.out.println(sb.toString());
		 	sc.close();
	 }
}
