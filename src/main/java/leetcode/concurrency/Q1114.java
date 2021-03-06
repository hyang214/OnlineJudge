package leetcode.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * title: Print in Order
 *
 * @author Hao YANG
 * @since 2019.11.21
 */
public class Q1114 {

    public interface Q1114Interface {

        void first(Runnable printFirst) throws InterruptedException ;

        void second(Runnable printFirst) throws InterruptedException ;

        void third(Runnable printFirst) throws InterruptedException ;

    }

    /**
     * 基于信号量的方法
     */
    public static class Q1114SemaphoreApproach implements Q1114Interface {

        /** first 2 second **/
        private static Semaphore f2s = new Semaphore(0);

        /** second 2 third **/
        private static Semaphore s2t = new Semaphore(0);

        @Override
        public void first(Runnable printFirst) throws InterruptedException  {
            printFirst.run();
            f2s.release(1);
        }

        @Override
        public void second(Runnable printSecond) throws InterruptedException  {
            f2s.acquire(1);
            printSecond.run();
            s2t.release(1);
        }

        @Override
        public void third(Runnable printThird) throws InterruptedException  {
            s2t.acquire(1);
            printThird.run();
        }

    }

    /**
     * 基于倒数计数的方法
     */
    public static class Q1114CountDownLatchApproach implements Q1114Interface {

        /** first 2 second **/
        private CountDownLatch f2s = new CountDownLatch(1);

        /** second 2 third **/
        private CountDownLatch s2t = new CountDownLatch(1);

        @Override
        public void first(Runnable printFirst) throws InterruptedException  {
            printFirst.run();
            f2s.countDown();
        }

        @Override
        public void second(Runnable printFirst) throws InterruptedException {
            f2s.await();
            printFirst.run();
            s2t.countDown();
        }

        @Override
        public void third(Runnable printFirst) throws InterruptedException {
            s2t.await();
            printFirst.run();
        }

    }

    public static class Q1114CyclicBarrierApproach implements Q1114Interface {

        /** first 2 second **/
        private CyclicBarrier f2s = new CyclicBarrier(2);

        /** second 2 third **/
        private CyclicBarrier s2t = new CyclicBarrier(2);

        @Override
        public void first(Runnable printFirst) throws InterruptedException  {
            try {
                printFirst.run();
                f2s.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void second(Runnable printFirst) throws InterruptedException {
            try {
                f2s.await();
                printFirst.run();
                s2t.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void third(Runnable printFirst) throws InterruptedException {
            try {
                s2t.await();
                printFirst.run();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }

    }

    public static class Q1114WhileAndVolatile implements Q1114Interface {

        /** first 2 second **/
        private volatile boolean f2s = true;

        /** second 2 third **/
        private volatile boolean s2t = true;

        @Override
        public void first(Runnable printFirst) throws InterruptedException  {
            printFirst.run();
            f2s = false;
        }

        @Override
        public void second(Runnable printFirst) throws InterruptedException {
            while (f2s) {

            }
            printFirst.run();
            s2t = false;
        }

        @Override
        public void third(Runnable printFirst) throws InterruptedException {
            while (s2t) {

            }
            printFirst.run();
        }

    }

}
