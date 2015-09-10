package huawei.easy;

import java.util.Scanner;

//输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
public class OJ009 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	sc.close();
		 	int[] count = new int[4];
		 	char[] list = tmp.toCharArray();
		 	for(char c: list){
		 		if(Character.isLetter(c))
		 			count[0]++;
		 		else if(c == ' ')
		 			count[1]++;
		 		else if(Character.isDigit(c))
		 			count[2]++;
		 		else
		 			count[3]++;
		 	}
		 	System.out.println(count[0]);
		 	System.out.println(count[1]);
		 	System.out.println(count[2]);
		 	System.out.println(count[3]);
	 }
}
