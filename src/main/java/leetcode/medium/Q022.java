package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 author: hyang
 date: Feb 13, 2016
 time: 5:23:15 PM
 purpose: 22. Generate Parentheses
**/
public class Q022 {
	
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
    	if(n == 0)
    		return result;
        int nLeft = n;
        int nRight = 0;
        StringBuffer tmp = new StringBuffer();
        collect(tmp, nLeft, nRight, result);
        return result;
    }

    /** we regard every instance as a length-2n string, for each position in an instance, we only have
     * two choose, '(' or ')', and some string is invalid **/
	private void collect(StringBuffer tmp, int nLeft, int nRight, List<String> result) {
		if(nLeft == 0 && nRight == 0){
			/** this case means tmp has already be an instance **/
			result.add(tmp.toString());
		}
		if(nLeft > 0 ){
			/** we add a '(' at the end of tmp, at the time the number of 'left' we can use should minus one,
			 * and the the number of 'right' we can use should plus on.
			 */
			StringBuffer one = new StringBuffer(tmp);
			one.append("(");
			collect(one, nLeft-1, nRight+1, result);
		}
		if(nRight > 0){
			/**
			 * we add a ')' at the end of tmp, and the the number of 'right' we can use should minus one.
			 */
			StringBuffer one = new StringBuffer(tmp);
			one.append(")");
			collect(one, nLeft, nRight-1, result);
		}
	}
	
	public static void main(String args[]){
		Q022 q022 = new Q022();
		for(int n = 1 ; n < 5 ; n ++){
			print(n, q022.generateParenthesis(n));
		}
	}
	
	private static void print(int n, List<String> result){
		System.out.println("n: " + n);
		for(String ins : result){
			System.out.println("	" + ins);			
		}
	}
} 
