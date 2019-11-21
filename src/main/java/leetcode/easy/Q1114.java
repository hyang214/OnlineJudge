package leetcode.easy;

import java.util.concurrent.Semaphore;

/**
 * title: Print in Order
 *
 * @author Hao YANG
 * @since 2019.11.21
 */
public class Q1114 {

    public interface Q1114Interface {

        void first(Runnable printFirst) throws InterruptedException;

        void second(Runnable printFirst) throws InterruptedException;

        void third(Runnable printFirst) throws InterruptedException;

    }

    public static class SemaphoreApproach implements Q1114Interface {

        /** first 2 second **/
        private static Semaphore f2s = new Semaphore(0);

        /** second 2 third **/
        private static Semaphore s2t = new Semaphore(0);


        @Override
        public void first(Runnable printFirst) throws InterruptedException {
            printFirst.run();
            f2s.release(1);
        }

        @Override
        public void second(Runnable printSecond) throws InterruptedException {
            f2s.acquire(1);
            printSecond.run();
            s2t.release(1);
        }

        @Override
        public void third(Runnable printThird) throws InterruptedException {
            s2t.acquire(1);
            printThird.run();
        }

    }



    public static class Print implements Runnable {

        private String msg;

        public Print(String msg) {
            this.msg = msg;
        }

        @Override
        public void run() {
            System.out.print(msg);
        }
    }

}
