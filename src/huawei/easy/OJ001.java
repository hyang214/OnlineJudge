package huawei.easy;
import java.util.Scanner;

//字符串最后一个单词的长度
public class OJ001 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	if(tmp == null || tmp.length() == 0)
		 		System.out.println(0); 
		 	int len = 0;
		 	for(int i = 0 ; i < tmp.length() ; i ++){
		 		if(tmp.charAt(i) == ' ')
		 			len = 0;
		 		else {
		 			len ++;
		 		}
		 	}
		 	System.out.println(len);
		 	sc.close();
		 }
}
