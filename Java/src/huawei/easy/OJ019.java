package huawei.easy;

import java.util.Scanner;

//±íÊ¾Êý×Ö
public class OJ019 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	char[] chars = tmp.toCharArray();
		 	StringBuffer sb = new StringBuffer();
		 	for(int i = 0 ; i < chars.length ; i ++){
		 		if(Character.isDigit(chars[i])){
		 			sb.append('*');
		 			sb.append(chars[i]);
		 			i++ ;
		 			while(i < chars.length && Character.isDigit(chars[i])){
		 				sb.append(chars[i]);
		 				i ++;
		 			}
		 			sb.append('*');
		 		}
		 		if(i < chars.length)
		 			sb.append(chars[i]);
		 	}
		 	
		 	System.out.println(sb.toString());
		 	sc.close();
	 }
}
