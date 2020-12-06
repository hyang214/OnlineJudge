package leetcode.algorithms.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.function.Function;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.10.25
 */
public class Q0003Test {

    private Function<String, Integer> function;

    @Before
    public void init() {
        Q0003 q0003 = new Q0003();
//        function = q0003::bruteForce;
//        function = q0003::smarter;
        function = q0003::smarterOptimizer;
    }

    @Test
    public void test01() {
        String str = "abcabcbb";
        Assert.assertEquals(3, calc(function, str));
    }

    @Test
    public void test02() {
        String str = "bbbbb";
        Assert.assertEquals(1, calc(function, str));
    }

    @Test
    public void test03() {
        String str = "pwwkew";
        Assert.assertEquals(3, calc(function, str));
    }

    @Test
    public void test04() {
        String str = null;
        Assert.assertEquals(0, calc(function, str));
    }

    @Test
    public void test05() {
        String str = "";
        Assert.assertEquals(0, calc(function, str));
    }

    @Test
    public void test06() {
        String str = "abcdef";
        Assert.assertEquals(6, calc(function, str));
    }

    @Test
    public void test07() {
        String str = "dvdf";
        Assert.assertEquals(3, calc(function, str));
    }

    @Test
    public void test08() {
        String str = "abba";
        Assert.assertEquals(2, calc(function, str));
    }

    private int calc(Function<String, Integer> function, String str) {
        return function.apply(str);
    }

}

