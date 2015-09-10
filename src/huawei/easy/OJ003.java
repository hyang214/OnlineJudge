package huawei.easy;
import java.util.BitSet;
import java.util.Scanner;

//Ãû×ÖµÄÆ¯ÁÁ¶È
public class OJ003 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	int N = Integer.valueOf(tmp);
		 	for(int i = 0 ; i < N; i ++){
		 		String name = sc.nextLine();
		 		int[] count = new int[26];
		 		name = name.toLowerCase();
		 		for(int j = 0 ; j < name.length() ; j ++){
		 			count[name.charAt(j) - 'a'] ++;
		 		}
		 		
		 		BitSet used = new BitSet();
		 		used.set(0, 26, true);
		 		int score = 0;
		 		for(int j = 26 ; j >= 1; j --){
		 			int max = Integer.MIN_VALUE;
		 			int index = -1;
			 		for(int k = 0 ; k < 26; k ++){
			 			if(count[k] > max && used.get(k)){
			 				max = count[k];
			 				index = k;
			 			}
			 		}
			 		score += j * max;
			 		used.set(index,false);
		 		}
		 		System.out.println(score);	
		 	}
		 	
		 	sc.close();
		 }
}
