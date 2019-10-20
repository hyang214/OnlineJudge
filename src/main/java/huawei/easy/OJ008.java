package huawei.easy;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Scanner;
		
//×Ö·û´®¼ÓÃÜ		
public class OJ008 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String key = sc.nextLine();
		 	String context = sc.nextLine();
		 	sc.close();

		 	/** construct map **/
		 	BitSet used = new BitSet();
		 	used.set(0, 26, true);
		 	char[] keys = key.toCharArray();
		 	HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		 	for(char c: keys){
		 		int cInt = c - 'a';
		 		Integer value = map.get(cInt);
		 		int size = map.size();
		 		if(value == null){
		 			map.put(size,cInt);
		 			used.set(cInt, false);
		 		}
		 	}
		 	
		 	for(int i = used.nextSetBit(0) ; i >= 0 ; i = used.nextSetBit(i+1)){
		 		int cInt = i;
		 		int size = map.size();
		 		map.put(size,cInt);
	 			used.set(cInt, false);
		 	}
		 	
		 	/** encode **/
		 	char[] contexts = context.toCharArray();
		 	char[] newC = new char[contexts.length+1];
		 	for(int i = 0 ; i < contexts.length ; i ++){
		 		if(Character.isLetter(contexts[i])){
		 			if(Character.isLowerCase(contexts[i])){
		 				int cInt = map.get(contexts[i]-'a');
				 		newC[i] = (char)(cInt + 'a');
		 			}else{
		 				char ccc = Character.toLowerCase(contexts[i]);
		 				int cInt = map.get(ccc-'a');
		 				char cccc = (char)(cInt + 'a');
				 		newC[i] = Character.toUpperCase(cccc);
		 			}
			 		
		 		}else{
		 			newC[i] = contexts[i];
		 		}
		 	}
		 	newC[contexts.length] = '\0';
		 	System.out.print(newC);
	 }
	 
}
