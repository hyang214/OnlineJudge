package poj.part1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Poj1004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		for(int i = 0 ; i < 12 ; i ++){
			sum += sc.nextDouble();
		}
		DecimalFormat df=new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		System.out.println("$"+df.format(sum/12).replaceAll(",", ""));
		System.out.println("$"+df.format(sum/12));
		sc.close();
	}
}
/* test data
15585414.1
145411445.2
5511.5
511.52
25
25514
5541
551
1235
2635.2
213265.555
1.235458485
Output:
$13437637.53
$13,437,637.53
 */

