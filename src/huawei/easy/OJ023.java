package huawei.easy;

import java.util.HashSet;
import java.util.Scanner;

//×Ö·û´®Æ¥Åä
public class OJ023 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String aS = sc.nextLine();
		 	String bS = sc.nextLine();
		 	sc.close();
		 	
		 	if(aS.length() > bS.length() ){
		 		System.out.println(false);
		 		return;
		 	}
		 	
		 	int count = 0;
		 	char[] aChar = aS.toCharArray();
		 	char[] bChar = bS.toCharArray();
		 	HashSet<Character> set = new HashSet<Character>();
		 	for(char c : bChar ){
		 		set.add(c);
		 	}
		 	for(char c: aChar){
		 		if(set.contains(c)){
		 			count++;
		 		}
		 	}
		 	if(count == aS.length())
		 		System.out.println(true);
		 	else
		 		System.out.println(false);
	 }
}


