package huawei.easy;
import java.util.Arrays;
import java.util.Scanner;

//НјЖ¬ХыАн		
public class OJ005 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	char[] list = tmp.toCharArray();
		 	Arrays.sort(list);
		 	System.out.println(list);
		 	sc.close();
		 }
}
