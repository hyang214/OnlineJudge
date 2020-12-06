package leetcode.concurrency;

import leetcode.concurrency.Q1116;
import leetcode.util.MyIntConsumer;
import leetcode.util.Print;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.12.15
 */
public class Q1116Test {

    private Constructor<? extends Q1116.Q1116Interface> constructor;

    @Before
    public void init() throws NoSuchMethodException {
        Class<Q1116.Q1116SemaphoreApproach> clazz = Q1116.Q1116SemaphoreApproach.class;
        constructor = clazz.getConstructor(int.class);
    }

    @Test
    public void n2Test() throws Exception {
        int n = 2;
        MyIntConsumer.END = new CountDownLatch(n * 2);
        String expect = "0102";
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Q1116.Q1116Interface exec = constructor.newInstance(n);
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.zero(new MyIntConsumer());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.even(new MyIntConsumer());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.odd(new MyIntConsumer());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
        MyIntConsumer.END.await();
        String result = Print.parseString(Print.parse(out));
        Assert.assertEquals(expect, result);
    }

    @Test
    public void n5Test() throws Exception {
        int n = 5;
        MyIntConsumer.END = new CountDownLatch(n * 2);
        String expect = "0102030405";
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Q1116.Q1116Interface exec = constructor.newInstance(n);
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.zero(new MyIntConsumer());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.even(new MyIntConsumer());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.odd(new MyIntConsumer());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
        MyIntConsumer.END.await();
        String result = Print.parseString(Print.parse(out));
        Assert.assertEquals(expect, result);
    }

}
