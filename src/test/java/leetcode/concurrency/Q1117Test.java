package leetcode.concurrency;

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
 * @since 2019.12.18
 */
public class Q1117Test {

    private Class<? extends Q1117.Q1117CountDownLatchApproach> clazz;

    @Before
    public void init() {
        clazz = Q1117.Q1117CountDownLatchApproach.class;
    }

    @Test
    public void test01() throws Exception {
        Integer n = 2;
        Print.END = new CountDownLatch(n * 3);
        Q1117.Q1117Interface exec = clazz.newInstance();
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(out));
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.hydrogen(new Print("H"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.hydrogen(new Print("H"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.oxygen(new Print("O"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.hydrogen(new Print("H"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.hydrogen(new Print("H"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.oxygen(new Print("O"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
        Print.END.await();
//        String result = Print.parseString(Print.parse(out));
//        Assert.assertEquals(true, match(result));
    }

    @Test
    public void test02() throws Exception {
        Integer n = 2;
        Print.END = new CountDownLatch(n * 3);
        Q1117.Q1117Interface exec = clazz.newInstance();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.hydrogen(new Print("H"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.hydrogen(new Print("H"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.oxygen(new Print("O"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
        Print.END.await();
        String result = Print.parseString(Print.parse(out));
        Assert.assertEquals(true, match(result));
    }

    @Test
    public void matchTest001() {
        String[] results = new String[] {"HHO", "HOH", "OHH"};
        for (String result: results) {
            Assert.assertEquals(true, match(result));
        }
    }

    @Test
    public void matchTest002() {
        String[] results = new String[] {"HHOHHO", "HOHHHO", "OHHHHO", "HHOHOH", "HOHHOH", "OHHHOH", "HHOOHH", "HOHOHH", "OHHOHH"};
        for (String result: results) {
            Assert.assertEquals(true, match(result));
        }
    }

    @Test
    public void matchTest003() {
        String[] results = new String[] {"HHHOHO", "OOHHHH"};
        for (String result: results) {
            Assert.assertEquals(false, match(result));
        }
    }

    private boolean match(String result) {
        int hCount = 0;
        int oCount = 0;
        for (char c: result.toCharArray()) {
            if (c == 'O') {
                oCount ++;
            } else if (c == 'H') {
                hCount ++;
            }
            if (hCount > 2 || oCount > 1) {
                return false;
            }
            if (hCount == 2 && oCount == 1) {
                hCount = 0;
                oCount = 0;
            }
        }
        return true;
    }

}
