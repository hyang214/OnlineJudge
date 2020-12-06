package leetcode.algorithms.easy;

public class Q007 {
    /*** Reverse Integer ***/
    public int reverse(int x) {
        int flag = x < 0 ? -1 : 1;
        
        /*** ���ú�������� ***/
        long xx = x;
        StringBuffer sb = new StringBuffer();
        sb.append(Math.abs(xx));
        long rl = flag * Long.valueOf(sb.reverse().toString());
        int r = 0;
        if(rl > Integer.MAX_VALUE || rl < Integer.MIN_VALUE)
        	r = 0;
        else{
        	r = (int)rl;
        }
        System.out.println(r);
    	return r;
    }
}
