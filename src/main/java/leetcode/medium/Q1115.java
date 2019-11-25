package leetcode.medium;

import leetcode.util.Print;

import java.util.concurrent.Semaphore;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.11.25
 */
public class Q1115 {

    public interface Q1115interface {

        void foo(Runnable printFoo) throws InterruptedException;

        void bar(Runnable printBar) throws InterruptedException;

    }

    public static int n = 10;

    public static class Q1115SemaphoreApproach implements Q1115interface {

        private static Semaphore f2b = new Semaphore(1);

        private static Semaphore b2f = new Semaphore(0);

        public void foo(Runnable printFoo) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                f2b.acquire(1);
                printFoo.run();
                b2f.release(1);
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                b2f.acquire(1);
                printBar.run();
                f2b.release(1);
            }
        }
    }




}
