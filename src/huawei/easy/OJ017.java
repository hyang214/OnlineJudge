package huawei.easy;

import java.util.BitSet;
import java.util.Scanner;

//字符个数统计
public class OJ017 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	char[] chars = tmp.toCharArray();
		 	int count = 0;
		 	BitSet used = new BitSet();
		 	used.set(0, 128, true);
		 	for(char c: chars){
		 		if(c < 128 && c >= 0 && used.get(c)){
		 			count ++;
		 			used.set(c, false);
		 		}
		 	}
		 	System.out.print(count);
		 	sc.close();
	 }
}
