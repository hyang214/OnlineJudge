package poj.part1;

import java.util.Scanner;

public class Poj1017 {

	public static void main(String[] args) { 
		
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		String[] ss = tmp.split(" ");
		int b1 = Integer.valueOf(ss[0]);
		int b2 = Integer.valueOf(ss[1]);
		int b3 = Integer.valueOf(ss[2]);
		int b4 = Integer.valueOf(ss[3]);
		int b5 = Integer.valueOf(ss[4]);
		int b6 = Integer.valueOf(ss[5]);
		
		while(b1+b2+b3+b4+b5+b6 != 0){
			int cost = 0;
			int c1 = 0;
			int c2 = 0;
			
			/* size: 6*6 */
			cost += b6;
			print(flag, cost, c2, c1);
			
			/* size: 5*5 */
			cost += b5;
			/* 6*5 - 5*5 =
			 * 11 * 1*1 
			 * */
			c1 += 11 * b5;
			print(flag, cost, c2, c1);
			
			/* size: 4*4 */
			cost += b4;
			/* 6*6 - 4*4 = 
			 * 5 * 4*4 or
			 * 20 * 1*1
			 * */
			c2 += 5 * b4;
			print(flag, cost, c2, c1);
			
			/* size 3*3 */
			if(b3 % 4 == 0){
				cost += b3/4;
			}else if(b3 % 4 == 1){
				int u3 = b3/4 + 1;
				cost += u3;
				/* 6*6 - 3*3 =  
				 * 5 * 2*2 + 7 * 1*1 or
				 * 27 * 1*1 
				 */
				c2 += 5;
				c1 += 7;
			}else if(b3 % 4 == 2){
				int u3 = b3/4 + 1;
				cost += u3;
				/* 6*6 - 2 * 3*3 =  
				 * 3 * 2*2 + 6 * 1*1 or
				 * 18 * 1*1 
				 */
				c2 += 3;
				c1 += 6;
			}else{
				int u3 = b3/4 + 1;
				cost += u3;
				/* 6*6 - 3 * 3*3 =  
				 * 1 * 2*2 + 5 * 1*1 or
				 * 9 * 1*1 
				 */
				c2 += 1;
				c1 += 5;
			}
			print(flag, cost, c2, c1);
			
			/* size: 2*2 */
			if(b2 >= c2){
				b2 = b2 - c2;
				c2 = 0;
				
				if(b2 % 9 == 0){
					cost += b2/9;
				}else{
					cost += b2/9;
					cost ++;
					c1 += 4 * (9 - b2%9);
				}
			}else{
				c2 = c2 - b2;
			}
			print(flag, cost, c2, c1);
			
			/* size: 1*1 */
			c1 += c2 * 4;
			if(b1 >= c1){
				b1 = b1 - c1;
				c1 = 0;
				
				if(b1%36 == 0){
					cost += b1/36;
				}else{
					cost += b1/36;
					cost ++;
				}
			}
			print(flag, cost, c2, c1);
			System.out.println(cost);
//			System.out.println("************");
			
			/* next case */
			tmp = sc.nextLine();
			ss = tmp.split(" ");
			b1 = Integer.valueOf(ss[0]);
			b2 = Integer.valueOf(ss[1]);
			b3 = Integer.valueOf(ss[2]);
			b4 = Integer.valueOf(ss[3]);
			b5 = Integer.valueOf(ss[4]);
			b6 = Integer.valueOf(ss[5]);
		}
		
		sc.close();
	}
	
	public static void print(boolean flag,int cost, int c2, int c1){
		if(flag == true)
			System.out.println(cost+" "+c2+" "+c1);
	}
}
/*
0 0 4 0 0 1
7 5 1 0 0 0
36 9 4 1 1 1
0 9 4 1 1 0
0 0 4 0 0 0
36 0 0 0 0 0
0 9 0 0 0 0
79 96 94 30 18 14
53 17 12 98 76 54
83 44 47 42 80 3
15 26 13 29 42 40
41 61 36 90 54 66
78 56 445 45 23 65
13 4 8 29 45 3
15 75 45 98 34 53
40 9 0 2 0 0
41 9 0 2 0 0
44 0 0 0 4 0
0 2 3 0 0 0
37 7 2 0 1 0
12 2 0 1 0 0
13 2 0 1 0 0
0 0 0 0 0 0
*/