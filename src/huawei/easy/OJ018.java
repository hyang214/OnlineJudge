package huawei.easy;

import java.util.BitSet;
import java.util.Scanner;

//提取不重复的整数
public class OJ018 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	Integer n = sc.nextInt();
		 	String tmp = n.toString();
		 	String[] tmps = tmp.split("");
		 	BitSet used = new BitSet();
		 	used.set(0, 10, true);

		 	StringBuffer sb = new StringBuffer();
		 	for(int i = tmp.length();i>0;i--){
		 		if(!(sb.toString().contains(tmp.subSequence(i-1, i))))
		 	    sb.append(tmp.subSequence(i-1, i));
		 	}
		 	
		 	System.out.println(Integer.valueOf(sb.toString()));
		 	sc.close();
	 }
}

