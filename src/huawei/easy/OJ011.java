package huawei.easy;

import java.util.Arrays;
import java.util.Scanner;

//����n�����������������С��k��
public class OJ011 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	int N = sc.nextInt();
		 	int k = sc.nextInt();
		 	int[] list = new int[N];
		 	for(int i = 0 ; i < N ; i ++){
		 		list[i] = sc.nextInt();
		 	}
		 	sc.close();
		 	Arrays.sort(list);
		 	StringBuffer sb = new StringBuffer();
		 	for(int i = 0 ; i < k ; i ++){
		 		sb.append(list[i]+" ");
		 	}
		 	sb.deleteCharAt(sb.length()-1);
		 	System.out.print(sb.toString());
	 }
}
