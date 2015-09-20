package leetcode.easy;

public class Q168 {
	/*** Excel Sheet Column Title ***/
	
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        
        do {
        	int left = (n - 1) % 26;
        	char one = (char)('A' + left);
        	sb.append(one);
        	n -= left;
        	n /= 26;
        }while(n != 0);
        
        sb = sb.reverse();
        
        return sb.toString();
    }
}
