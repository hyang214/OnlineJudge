package huawei.easy;

import java.util.Scanner;

//查找输入整数二进制中1的个数
public class OJ012 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	Integer tmp = sc.nextInt();
		 	String s = Integer.toBinaryString(tmp);
		 	int count = 0;
		 	for(int i = 0 ; i < s.length() ;i ++){
		 		if(s.charAt(i) == '1')
		 			count++;
		 	}
		 	System.out.print(count);
	 }
}
