package poj.part1;

import java.util.Scanner;

public class Poj1005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int c = 1;
		while(c <= len){
			double x=sc.nextDouble();
			double y=sc.nextDouble();
			double area=Math.PI*(x*x+y*y);
			int ans=0;
			double sum=0;
			while(sum<area){
				ans++;
				sum+=100;
			}
			System.out.println("Property "+c+": This property will begin eroding in year "+ans+".");
			c++;
		}
		sc.close();
		System.out.println("END OF OUTPUT.");
	}
}
