package poj.part1;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Poj1002 {

	public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String s = in.nextLine();
        int c = Integer.valueOf(s);
        Map<String,Integer> map = new TreeMap<String, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < c ; i ++){
        	String tmp = in.nextLine();
            tmp = tmp.replaceAll("-", "");
            tmp = tmp.replaceAll("[A-C]", "2");
            tmp = tmp.replaceAll("[D-F]", "3");
            tmp = tmp.replaceAll("[G-I]", "4");
            tmp = tmp.replaceAll("[J-L]", "5");
            tmp = tmp.replaceAll("[M-O]", "6");
            tmp = tmp.replaceAll("[P,R,S]", "7");
            tmp = tmp.replaceAll("[T-V]", "8");
            tmp = tmp.replaceAll("[W-Y]", "9");
            tmp = tmp.replaceAll("[Q,Z]", "");
            Integer count = map.get(tmp);
            if(count == null){
            	map.put(tmp, new Integer(1));
            	list.add(Integer.valueOf(tmp));
            }
            else
            	map.put(tmp, new Integer( count +1));
        }
        in.close();
        
//        list.sort(new Comparator<Integer>() {
//			public int compare(Integer o1, Integer o2) {
//				if(o1.equals(o2))
//					return 0;
//				else if(o1 < o2)
//					return -1;
//				else
//					return 1;
//			}	
//		});
        
//        for(int i = 0 ; i < list.size() ; i ++){
//        	for(int j = 0 ; j < list.size() -1 ; j ++){
//        		Integer aV = list.get(j);
//        		Integer bV = list.get(j+1);
//        		if(aV > bV){
//        			list.set(j, bV);
//        			list.set(j+1, aV);
//        		}		
//            }
//        }
        
        boolean no = true;
        for(Integer key : list){
        	String ss = key.toString();
        	if(map.get(ss) == 1){
        		continue;
        	}
        	no = false;
        	ss = ss.substring(0, 3)+"-"+ss.substring(3, 7);
        	System.out.println(ss+" "+map.get(key.toString()));
        }
        if(no)
        	System.out.println("No duplicates. ");
    }
}

/*
 * 下面是一个AC了的代码
 * Why？？？
 * */
//import java.io.BufferedInputStream;
//import java.io.DataInputStream;
//import java.io.IOException;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class Main {
//	@SuppressWarnings("deprecation")
//	public static void main(String[] args) throws IOException {
//		DataInputStream input = new DataInputStream(new BufferedInputStream(System.in));
//		int number = Integer.parseInt(input.readLine());
//		Integer count;
//		Map<String, Integer> map = new TreeMap<String, Integer>();
//		for (int i = 0; i < number; i++) {
//			String phoneNumber = input.readLine().replace("-", "");
//			StringBuffer sb = new StringBuffer();
//			for (int j = 0; j < 7; j++) {
//				char c = phoneNumber.charAt(j);
//				if (Character.isDigit(c)) {
//					sb.append(c);
//					continue;
//				}
//				if (c == 'A' || c == 'B' || c == 'C') {
//					c = '2';
//				}
//				if (c == 'D' || c == 'E' || c == 'F') {
//					c = '3';
//				}
//				if (c == 'G' || c == 'H' || c == 'I') {
//					c = '4';
//				}
//				if (c == 'J' || c == 'K' || c == 'L') {
//					c = '5';
//				}
//				if (c == 'M' || c == 'N' || c == 'O') {
//					c = '6';
//				}
//				if (c == 'P' || c == 'R' || c == 'S') {
//					c = '7';
//				}
//				if (c == 'T' || c == 'U' || c == 'V') {
//					c = '8';
//				}
//				if (c == 'W' || c == 'X' || c == 'Y') {
//					c = '9';
//				}
//				sb.append(c);
//			}
//			String result = sb.toString();
//			if (map.containsKey(result)) {
//				count = map.get(result) + 1;
//				map.put(result, count);
//			} else {
//				map.put(result, 1);
//			}
//		}
//		boolean flag = false;
//		for (String key : map.keySet()) {
//			count = map.get(key);
//			if (count > 1) {
//				flag = true;
//				System.out.println(key.substring(0, 3) + "-" + key.substring(3) + " " + count);
//			}
//		}
//		if (!flag) {
//			System.out.println("No duplicates. ");
//		}
//	}
//}

