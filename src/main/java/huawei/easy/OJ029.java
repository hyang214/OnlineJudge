package huawei.easy;

import java.util.Scanner;

//DNA–Ú¡–
public class OJ029 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String dna = sc.nextLine();
		 	int k = Integer.valueOf(sc.nextLine());
		 	sc.close();
		 	
		 	String maxS = "";
		 	double ratio = Double.MIN_VALUE;
		 	for(int i = 0 ; i < dna.length() - k ; i ++){
		 		for(int j = i +k ; j <= dna.length() ; j ++){
	 				double lRatio = getRatio(dna.substring(i, j));
	 				if(lRatio > ratio){
	 					ratio = lRatio;
	 					maxS = dna.substring(i, j);
	 				}
	 			}
		 	}
		 	
		 	System.out.println(maxS);
	 }

	private static double getRatio(String lMaxS) {
		double GCount = 0;
		double CCount = 0;
		for(int i = 0 ; i < lMaxS.length() ; i ++){
			if(lMaxS.charAt(i) == 'G')
				GCount++;
			else if(lMaxS.charAt(i) == 'C')
				CCount++;
		}
		return (GCount + CCount)/(double)(lMaxS.length());
	} 
}

