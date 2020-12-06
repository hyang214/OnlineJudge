package leetcode.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.12.16
 */
public class Q1117 {

    public interface Q1117Interface {

        void hydrogen(Runnable releaseHydrogen) throws Exception;

        void oxygen(Runnable releaseOxygen) throws Exception;

    }

    public static class Q1117CountDownLatchApproach implements Q1117Interface {

        private Semaphore hArriveS = new Semaphore(2);

        private Semaphore oArriveS = new Semaphore(2);

        @Override
        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
            hArriveS.acquire();
            releaseHydrogen.run();
            oArriveS.release();
        }

        @Override
        public void oxygen(Runnable releaseOxygen) throws InterruptedException {
            oArriveS.acquire(2);
            releaseOxygen.run();
            hArriveS.release(2);
        }

    }

}
