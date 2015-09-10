package huawei.easy;

import java.util.Scanner;

//计算两个字符串的最大公共字串的长度，字符不区分大小写
public class OJ025 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	tmp = tmp.toLowerCase();
		 	sc.close();
		 	String[] tmps = tmp.split(" ");
		 	String sS = tmps[0].length() < tmps[1].length()? tmps[0]: tmps[1];
		 	String lS = tmps[0].length() < tmps[1].length()? tmps[1]: tmps[0];
		 	
		 	
		 	for(int i = 0 ; i < sS.length() ; i ++){
		 		for(int j = sS.length() ; j > 0 ; j --){
		 			if(i == j )
		 				return ;
		 			String c = sS.substring(i, j);
		 			if(lS.contains(c)){
		 				System.out.println(c.length());
		 				return;
		 			}
		 		}
		 	}
	 }
}

