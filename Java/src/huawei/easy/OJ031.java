package huawei.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//×Ö·ûÍ³¼Æ
public class OJ031 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		sc.close();
		
		int[] count = new int[256];
		char[] list = tmp.toCharArray();
		for(char c : list){
			if(c >= 0 && c < 256){
				count[c] ++;
			}
		}
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for(int i = 0 ; i < count.length ; i ++){
			if(count[i] == 0)
				continue;
			
			String s = map.get(new Integer(count[i]));
			if(s == null)
				map.put(new Integer(count[i]), (char)i + "");
			else
				map.put(new Integer(count[i]), s+(char)i);
		}
		
		Arrays.sort(count);
		StringBuffer sb = new StringBuffer();
		for(int i = count.length - 1 ; i > -1 ;i --){
			if(count[i] == 0)
				break;
			
			if(i == count.length - 1)
				sb.append(map.get(count[i]));
			else{
				if(count[i] == count[i+1])
					continue;
				else
					sb.append(map.get(count[i]));
			}
		}
		System.out.println(sb.toString());
	}
}
