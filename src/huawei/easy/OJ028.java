package huawei.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//质数因子
public class OJ028 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	int tmp = sc.nextInt();
		 	sc.close();
		 	ArrayList<Integer> primeFactorList = new ArrayList<Integer>();
		 	getPrimeFactor(tmp, primeFactorList);
		 	
		 	int[] array = new int[primeFactorList.size()];
		 	for(int i = 0 ; i < primeFactorList.size() ; i  ++){
		 		array[i] = primeFactorList.get(i);
		 	}
		 	Arrays.sort(array);
		 	StringBuffer sb = new StringBuffer();
		 	for(int i = 0 ; i < array.length ; i ++){
		 		sb.append(array[i]+" ");
		 	}
		 	sb = sb.deleteCharAt(sb.length() - 1);
		 	System.out.println(sb.toString());
	 }
	 
	 private static void getPrimeFactor(int tmp,
			ArrayList<Integer> primeFactorList) {
		if(isPrime(tmp))
			primeFactorList.add(tmp);
		else{
			for(int i = 2 ; i < tmp ; i ++){
				if(tmp % i == 0){
					getPrimeFactor(i, primeFactorList);
					getPrimeFactor(tmp / i, primeFactorList);
					return;
				}
			}
		}
	}

	private static boolean isPrime(int tmp) {
		if(tmp == 2)
			return true;
		for(int i = 2 ; i <= Math.sqrt(tmp) ; i ++){
			if(tmp % i == 0)
				return false;
		}
		return true;
	}
}

