package poj.part1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Poj1001 {

	public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        while(in.hasNext()){
            BigDecimal val=in.nextBigDecimal();
            int n=in.nextInt();
            BigDecimal ret=val.pow(n);
            System.out.println(ret.toPlainString());
            System.out.println(ret.stripTrailingZeros().toPlainString());
            System.out.println( ret.toPlainString().replaceAll("^0", "") );
        }
        in.close();
    }
}
