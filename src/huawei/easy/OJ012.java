package huawei.easy;

import java.util.Scanner;

//��������������������1�ĸ���
public class OJ012 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	Integer tmp = sc.nextInt();
		 	sc.close();
		 	String s = Integer.toBinaryString(tmp);
		 	int count = 0;
		 	for(int i = 0 ; i < s.length() ;i ++){
		 		if(s.charAt(i) == '1')
		 			count++;
		 	}
		 	System.out.print(count);
	 }
}
