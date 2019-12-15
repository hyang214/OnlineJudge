package leetcode.util;

import java.util.concurrent.CountDownLatch;
import java.util.function.IntConsumer;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.12.15
 */
public class MyIntConsumer implements IntConsumer {

    public static CountDownLatch END;

    @Override
    public void accept(int value) {
        System.out.print(value);
        END.countDown();
    }

}
