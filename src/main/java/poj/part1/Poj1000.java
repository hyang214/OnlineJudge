package poj.part1;

import java.util.Scanner;

public class Poj1000 {

//	 public static void main (String args[]) throws Exception
//	    {
//	        BufferedReader stdin = 
//	            new BufferedReader(
//	                new InputStreamReader(System.in));
//
//	        String line = stdin.readLine();
//	        while(line != null && line.length() > 0){
//	        	StringTokenizer st = new StringTokenizer(line);
//	        	int a = Integer.parseInt(st.nextToken());
//	        	int b = Integer.parseInt(st.nextToken());
//	        	System.out.println(a+b);
//	        	line = stdin.readLine();
//	        }
//	    }
	public static void main(String[] args) {
		 Scanner in =new Scanner(System.in);
		 while(in.hasNext()){
			 int a = in.nextInt();
	         int b = in.nextInt();
	         System.out.println(a+b);
		 }
		 in.close();
	}
}
