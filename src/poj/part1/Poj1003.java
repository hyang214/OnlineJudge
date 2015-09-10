package poj.part1;

import java.util.Scanner;

public class Poj1003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			double length = sc.nextDouble();
			if(length == 0.0)
				break;
			double s = 0.0;
			int i;
			for(i = 2; ; i ++){
				s+=(double)1/i;
				if(s>length) break;
			}
			System.out.println((i-1)+" card(s)");
		}
		sc.close();
	}
}
