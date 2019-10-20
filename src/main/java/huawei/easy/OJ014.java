package huawei.easy;

import java.util.Scanner;

//·ÅÆ»¹û
public class OJ014 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	int M = sc.nextInt();
		 	int N = sc.nextInt();
		 	
		 	int sum = getKinds(M, N);
		 	System.out.print(sum);
		 	sc.close();
	 }
	 
	 private static int getKinds(int M, int N){
		 if(M==0||N==1)
			 return 1;
		 if(M < N)
			 return getKinds(M, M);
		 else{
			 return getKinds(M, N-1)+getKinds(M-N, N);
		 }
	 }
}
