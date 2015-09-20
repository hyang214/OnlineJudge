package huawei.easy;
import java.util.Scanner;

//¡∑œ∞”√ ÃÙ7	
public class OJ004 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	int N = Integer.valueOf(tmp);
		 	int count = 0;
		 	for(int i = 1 ; i <= N ; i ++){
		 		if(i % 7 == 0){
		 			count++;
		 			continue;
		 		}else{
		 			int k = i;
		 			while(k > 0){
		 				if(k % 10 == 7){
		 					count ++;
		 					break;
		 				}else{
		 					k = k /10;
		 				}
		 			}
		 		}
		 		
		 	}
		 	System.out.println(count);
		 	sc.close();
		 }
}
