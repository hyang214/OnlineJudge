package huawei.easy;
import java.util.Scanner;


public class OJ002 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	String[] tmps = tmp.split(" ");
		 	int N = Integer.valueOf(tmps[0]);
		 	int[] hs = new int[N];
		 	for(int i = 1 ; i <= N ; i ++){
		 		hs[i-1] = Integer.valueOf(tmps[i]);
		 	}
		 	int[] bigCount = new int[N];
		 	for(int i = 0 ; i < N ; i ++){
		 		for(int j = i + 1 ; j < N ; j ++){
		 			if(hs[i] > hs[j])
		 				bigCount[i] ++;
		 		}
		 	}
		 	int k = 0;
		 	for(int i = 0 ; i < N ; i ++){
		 		if(bigCount[i] > 0)
		 			k ++;
		 	}
		 	System.out.println(k);
		 	sc.close();
		 }
}
