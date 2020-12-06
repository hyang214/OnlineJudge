package leetcode.concurrency;

import leetcode.concurrency.Q1114;
import leetcode.util.Print;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.11.21
 */
public class Q1114Test {

    private Class<? extends Q1114.Q1114Interface> clazz;

    private static String FIRST = "first";
    private static String SECOND = "second";
    private static String THIRD = "third";

    private static String RESULT = FIRST + SECOND + THIRD;

    @Before
    public void init() {
//        clazz = Q1114.Q1114SemaphoreApproach.class;
        clazz = Q1114.Q1114CountDownLatchApproach.class;
//        clazz = Q1114.Q1114CyclicBarrierApproach.class;
//        clazz = Q1114.Q1114WhileAndVolatile.class;
    }

    @Test
    public void test001() throws Exception {
        Print.END = new CountDownLatch(3);
        Q1114.Q1114Interface exec = clazz.newInstance();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.first(new Print(FIRST));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.second(new Print(SECOND));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.third(new Print(THIRD));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
        Print.END.await();
        String result = Print.parseString(Print.parse(out));
        Assert.assertEquals(RESULT, result);
    }


    @Test
    public void test002() throws Exception {
        Print.END = new CountDownLatch(3);
        Q1114.Q1114Interface exec = clazz.newInstance();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.first(new Print(FIRST));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.third(new Print(THIRD));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.second(new Print(SECOND));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
        Print.END.await();
        String result = Print.parseString(Print.parse(out));
        Assert.assertEquals(RESULT, result);
    }

}
