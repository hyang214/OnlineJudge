package leetcode.algorithms.easy;
/**
 * author: Hao 
 * date:2015��8��7��
 * time:����10:01:21
 * purpose:
 */
public class Q223 {
	/*** Rectangle Area ***/
	
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int r1A = (C - A) * (D - B);
        int r2A = (G - E) * (H - F);
        int redA = (C<G?C:G - A<E?E:A) * (D<H?D:H - B<F?F:B);
        if(C < E || G > A){
        	if(B > H || D < F){
        		redA = 0;
        	}
        }
        int area = Math.abs(r1A) + Math.abs(r2A) - Math.abs(redA);
     	return area;
    }
}
