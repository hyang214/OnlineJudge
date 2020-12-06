package leetcode.concurrency;

import leetcode.concurrency.Q1115;
import leetcode.util.Print;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.11.25
 */
public class Q1115Test {

    private final String FOO = "foo";

    private final String BAR = "bar";

    private Class<? extends Q1115.Q1115interface> clazz;

    @Before
    public void init() {
        clazz = Q1115.Q1115SemaphoreApproach.class;
    }

    @Test
    public void test01() throws Exception {
        int N = 10;
        Q1115.n = N;
        Print.END = new CountDownLatch(N * 2);
        Q1115.Q1115interface exec = clazz.newInstance();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.foo(new Print(FOO));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.bar(new Print(BAR));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
        Print.END.await();
        String result = Print.parseString(Print.parse(out));
        Assert.assertEquals(expect(N), result);
    }

    @Test
    public void test02() throws Exception {
        int N = 100;
        Q1115.n = N;
        Print.END = new CountDownLatch(N * 2);
        Q1115.Q1115interface exec = clazz.newInstance();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.bar(new Print(BAR));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.foo(new Print(FOO));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
        Print.END.await();
        String result = Print.parseString(Print.parse(out));
        Assert.assertEquals(expect(N), result);
    }

    private String expect(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i ++) {
            sb.append(FOO).append(BAR);
        }
        return sb.toString();
    }

}
