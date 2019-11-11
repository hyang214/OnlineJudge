package leetcode.hard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.function.BiFunction;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.11.12
 */
public class Q0004Test {

    private BiFunction<int[], int[], Double> function;

    @Before
    public void init() {
        Q0004 q0004 = new Q0004();
        function = q0004::combineIntoOneArray;
    }

    @Test
    public void test01() {
        int[] num1 = new int[]{};
        int[] num2 = new int[]{1, 2};
        double result = function.apply(num1, num2);
        double expect = (1 + 2) / 2;
        Assert.assertEquals( true, isEquals(result, expect));
    }

    @Test
    public void test02() {
        int[] num1 = new int[]{1, 3};
        int[] num2 = new int[]{2};
        double result = function.apply(num1, num2);
        double expect = 2.0;
        Assert.assertEquals( true, isEquals(result, expect));
    }

    @Test
    public void test03() {
        int[] num1 = new int[]{1, 2};
        int[] num2 = new int[]{3, 4};
        double result = function.apply(num1, num2);
        double expect = (2 + 3) / 2.0;
        Assert.assertEquals( true, isEquals(result, expect));
    }

    @Test
    public void test04() {
        int[] num1 = new int[]{1, 2};
        int[] num2 = new int[]{3, 4, 5, 6, 7, 8};
        double result = function.apply(num1, num2);
        double expect = (4 + 5) / 2;
        Assert.assertEquals( true, isEquals(result, expect));
    }

    @Test
    public void test05() {
        int[] num1 = new int[]{1, 2};
        int[] num2 = new int[]{3, 4, 5, 6, 7, 8, 9};
        double result = function.apply(num1, num2);
        double expect = 5.0;
        Assert.assertEquals( true, isEquals(result, expect));
    }

    @Test
    public void test06() {
        int[] num1 = new int[]{3, 4, 5, 6, 7, 8};
        int[] num2 = new int[]{1, 2};
        double result = function.apply(num1, num2);
        double expect = (4 + 5) / 2;
        Assert.assertEquals( true, isEquals(result, expect));
    }

    @Test
    public void test07() {
        int[] num1 = new int[]{3, 4, 5, 6, 7, 8, 9};
        int[] num2 = new int[]{1, 2};
        double result = function.apply(num1, num2);
        double expect = 5.0;
        Assert.assertEquals( true, isEquals(result, expect));
    }

    private boolean isEquals(double one, double two) {
        Long oneL = Double.doubleToLongBits(one);
        Long twoL = Double.doubleToLongBits(two);
        return oneL.equals(twoL);
    }

}
