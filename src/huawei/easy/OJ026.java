package huawei.easy;

import java.util.Scanner;

//求int型数据在内存中存储时1的个数
public class OJ026 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	Integer tmp = sc.nextInt();
		 	sc.close();
		 	String bS = Integer.toBinaryString(tmp);
		 	int count = 0;
		 	for(int i = 0; i < bS.length() ; i ++){
		 		if(bS.charAt(i) == '1')
		 			count++;
		 	}
		 	System.out.println(count);
	 }
}

