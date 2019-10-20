package huawei.easy;

import java.util.HashSet;
import java.util.Scanner;

//������
public class OJ010 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	int N = sc.nextInt();
		 	int[] weights = new int[N];
		 	int[] nums = new int[N];
	
	        for (int i = 0; i < N; i++)
	            weights[i] = sc.nextInt();
	        for (int i = 0; i < N; i++)
	            nums[i] = sc.nextInt();
	        sc.close();
		 	
		 	HashSet<Integer> results = new HashSet<Integer>();
		 	results.add(0);
		 	
		 	for(int i = 0 ; i < N ; i ++){
		 		HashSet<Integer> tmp = new HashSet<Integer>();
		 		for(int j = 1 ; j <= nums[i]; j ++){
		 			for(Integer v: results){
		 				tmp.add(v + j * weights[i]);
		 			}
		 		}
		 		results.addAll(tmp);
		 	}
		 	
		 	System.out.print(results.size());
	 }
}
