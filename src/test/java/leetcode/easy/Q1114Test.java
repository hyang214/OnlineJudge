package leetcode.easy;

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
//        clazz = Q1114.SemaphoreApproach.class;
//        clazz = Q1114.CountDownLatchApproach.class;
        clazz = Q1114.CyclicBarrierApproach.class;
    }

    @Test
    public void test001() throws Exception {
        Q1114.END = new CountDownLatch(3);
        Q1114.Q1114Interface exec = clazz.newInstance();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.first(new Q1114.Print(FIRST));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.second(new Q1114.Print(SECOND));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.third(new Q1114.Print(THIRD));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
        Q1114.END.await();
        String result = parseString(parse(out));
        Assert.assertEquals(RESULT, result);
    }


    @Test
    public void test002() throws Exception {
        Q1114.END = new CountDownLatch(3);
        Q1114.Q1114Interface exec = clazz.newInstance();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.first(new Q1114.Print(FIRST));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.third(new Q1114.Print(THIRD));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.second(new Q1114.Print(SECOND));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
        Q1114.END.await();
        String result = parseString(parse(out));
        Assert.assertEquals(RESULT, result);
    }

    public ByteArrayInputStream parse(ByteArrayOutputStream out) throws Exception {
        ByteArrayInputStream swapStream = new ByteArrayInputStream(out.toByteArray());
        return swapStream;
    }

    public String parseString(InputStream in) throws Exception
    {
        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        int ch;
        while ((ch = in.read()) != -1) {
            swapStream.write(ch);
        }
        return swapStream.toString();
    }

}
