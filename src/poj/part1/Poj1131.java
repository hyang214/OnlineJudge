package poj.part1;

import java.math.BigDecimal;
import java.util.*;

public class Poj1131 {
	public static void main(String[] args)
	{
		String s;
		BigDecimal  eight = new BigDecimal(8);
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			s = sc.nextLine();
			BigDecimal ans = new BigDecimal(0);
			BigDecimal temp = new BigDecimal(1);
			for(int i = 2; i < s.length(); i ++)
			{
				temp = temp.divide(eight);//tmp = 1/8, 1/64, 1/512...
				ans = ans.add(new BigDecimal(s.charAt(i) - '0').multiply(temp));
			}
			System.out.println(s + " [8] = " + ans.stripTrailingZeros().toPlainString() + " [10]");
		}
		sc.close();
	}
}