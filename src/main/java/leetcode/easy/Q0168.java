package leetcode.easy;

public class Q0168 {
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

    public static void main(String[] args) {
        Q0168 q0168 = new Q0168();
        System.out.println(q0168.convertToTitle(399));
        System.out.println(q0168.convertToTitle(1199));
        System.out.println(q0168.convertToTitle(1111299));
    }
}
