package leetcode.medium;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.12.01
 */
public class Q1116 {

    public interface Q1116Interface {

        void zero(IntConsumer printNumber) throws InterruptedException;

        void even(IntConsumer printNumber) throws InterruptedException;

        void odd(IntConsumer printNumber) throws InterruptedException;

    }

    public static class Q1116SemaphoreApproach implements Q1116Interface {

        private int n;
        public Q1116SemaphoreApproach(int n) {
            this.n = n;
        }

        private Semaphore sz = new Semaphore(1);
        private Semaphore se = new Semaphore(0);
        private Semaphore so = new Semaphore(0);


        @Override
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 0; i < n; i ++) {
                sz.acquire();
                printNumber.accept(0);
                if (i % 2 == 0) {
                    so.release(1);
                } else {
                    se.release(1);
                }
            }
        }

        @Override
        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 2 ; i <= n ; i += 2) {
                se.acquire();
                printNumber.accept(i);
                sz.release(1);
            }
        }

        @Override
        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1 ; i <= n ; i += 2) {
                so.acquire();
                printNumber.accept(i);
                sz.release(1);
            }
        }
    }

}
