package poj.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Poj1046 {

	static int RGB = 3;
	
	public static void main(String[] args) { 
		
		boolean flag = false;
		int TSS = 16;
		ArrayList<RGB> targetSet = new ArrayList<RGB>();
		
		Scanner sc = new Scanner(System.in);
		
		/* target set */

		for(int i = 0 ; i < TSS  ; i ++){
			String tmp = sc.nextLine();
			String[] ss = tmp.split(" ");
			targetSet.add(new RGB(Integer.valueOf(ss[0]), Integer.valueOf(ss[1]), Integer.valueOf(ss[2])));
		}
		
		/* next case */
		String tmp = sc.nextLine();
		String[] ss = tmp.split(" ");
		int b1 = Integer.valueOf(ss[0]);
		int b2 = Integer.valueOf(ss[1]);
		int b3 = Integer.valueOf(ss[2]);
		/* map set */
		while(b1+b2+b3 != -3){
			RGB mapRGB = new RGB(b1, b2, b3);
			int mapped = -1;;
			double min = Double.MAX_VALUE;
			for(int i = 0 ; i < targetSet.size() ; i ++){
				double dist = mapRGB.distTo(targetSet.get(i));
				if(dist < min){
					min = dist;
					mapped = i;
				}
			}
			System.out.println(mapRGB.toString()+" maps to "+targetSet.get(mapped).toString());
			tmp = sc.nextLine();
			ss = tmp.split(" ");
			b1 = Integer.valueOf(ss[0]);
			b2 = Integer.valueOf(ss[1]);
			b3 = Integer.valueOf(ss[2]);
		}
		
		sc.close();
	}
	
	public static class RGB {
		int R;
		int G;
		int B;
		public RGB(int R, int G, int B) {
			this.R = R;
			this.G = G;
			this.B = B;
		}
		public double distTo(RGB t){
			double dist = 0.0;
			dist += Math.pow(this.R - t.R, 2);
			dist += Math.pow(this.G - t.G, 2);
			dist += Math.pow(this.B - t.B, 2);
			dist = Math.sqrt(dist);
			return dist;
		}
		public String toString(){
			return "("+R+","+G+","+B+")";
		}
	}
	
}