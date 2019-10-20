package huawei.easy;
import java.util.Scanner;
		
//ÉßÐÎ¾ØÕó			
public class OJ007 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	int N = Integer.valueOf(tmp);
		 	sc.close();
		 	
		 	for(int i = 1 ; i <= N ; i ++){
			 	StringBuffer sb = new StringBuffer();
		 		for(int j = 1 ; j <= N - i + 1 ; j ++){
		 			sb.append(valueAt(i, j)+" ");
		 		}
		 		sb.deleteCharAt(sb.length()-1);
		 		System.out.println(sb.toString());	
		 	}

	 }

	private static int valueAt(int i, int j) {
		int start = 1;
		for(int k = 2 ; k <= i ; k ++){
			start += (k-1);
		}
		
		for(int k = 2 ; k<= j ; k ++){
			start += (k+i-1);
		}
		
		return start;
	}
	 
}
