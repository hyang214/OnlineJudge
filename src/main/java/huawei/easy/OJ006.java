package huawei.easy;
import java.util.Scanner;
		
//×Ö·û´®¼Ó½âÃÜ			
//in: abcdefg BCDEFGH
//out: BCDEFGH abcdefg
public class OJ006 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	char[] in = tmp.toCharArray();
		 	System.out.println(Encrypt(in));		
		 	tmp = sc.nextLine();
		 	char[] out = tmp.toCharArray();
		 	System.out.println(unEncrypt(out));;
		 	sc.close();
	 }

	private static char[] unEncrypt(char[] out) {
		char[] un = new char[out.length];
		for(int i = 0 ; i < out.length ; i ++){
			if(Character.isLowerCase(out[i])){
				if(out[i] != 'a'){
					un[i] = Character.toUpperCase((char)(out[i]-1));
				}else{
					un[i] = 'Z';
				}
			}else if(Character.isUpperCase(out[i])){
				if(out[i] != 'A'){
					un[i] = Character.toLowerCase((char)(out[i]-1));
				}else{
					un[i] = 'z';
				}
			}else if(Character.isDigit(out[i])){
				if(out[i] != '0'){
					un[i] = (char)(out[i]-1);
				}else{
					un[i] = '9';
				}
			}
		}
		return un;
	}

	private static char[] Encrypt(char[] in) {
		char[] en = new char[in.length];
		for(int i = 0 ; i < in.length ; i ++){
			if(Character.isLowerCase(in[i])){
				if(in[i] != 'z'){
					en[i] = Character.toUpperCase((char)(in[i]+1));
				}else{
					en[i] = 'A';
				}
			}else if(Character.isUpperCase(in[i])){
				if(in[i] != 'Z'){
					en[i] = Character.toLowerCase((char)(in[i]+1));
				}else{
					en[i] = 'a';
				}
			}else if(Character.isDigit(in[i])){
				if(in[i] != '9'){
					en[i] = (char)(in[i]+1);
				}else{
					en[i] = '0';
				}
			}
		}
		return en;
	}
	 
}
