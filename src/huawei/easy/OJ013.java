package huawei.easy;

import java.util.Scanner;

//找出字符串中第一个只出现一次的字符
public class OJ013 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	sc.close();
		 	char[] list = tmp.toCharArray();
		 	int[] count = new int[256];
		 	for(char c: list){
		 		count[c]++;
		 	}
		 	/** 多个结果，输出元字符串中顺序最靠前的 **/
		 	for(char c: list){
		 		if(count[c] == 1){
		 			System.out.print(c);
		 			return;
		 		}
		 	}
		 	System.out.print('.');

	 }
}
