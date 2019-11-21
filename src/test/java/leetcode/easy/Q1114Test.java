package leetcode.easy;

import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.11.21
 */
public class Q1114Test {

    private Q1114.Q1114Interface exec;

    @Before
    public void init() {
        exec = new Q1114.SemaphoreApproach();
    }

    @Test
    public void test001() {
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.first(new Q1114.Print("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.second(new Q1114.Print("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.third(new Q1114.Print("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
    }


    @Test
    public void test002() {
        List<Thread> threads = Lists.newArrayList();
        threads.add(new Thread(() -> {
            try {
                exec.first(new Q1114.Print("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.third(new Q1114.Print("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        threads.add(new Thread(() -> {
            try {
                exec.second(new Q1114.Print("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        for (Thread thread: threads) {
            thread.start();
        }
    }

}
