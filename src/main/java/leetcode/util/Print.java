package leetcode.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.11.25
 */
public class Print implements Runnable {

    private String msg;
    public static CountDownLatch END;

    public Print(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.print(msg);
        END.countDown();
    }

    public static ByteArrayInputStream parse(ByteArrayOutputStream out) throws Exception {
        ByteArrayInputStream swapStream = new ByteArrayInputStream(out.toByteArray());
        return swapStream;
    }

    public static String parseString(InputStream in) throws Exception
    {
        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        int ch;
        while ((ch = in.read()) != -1) {
            swapStream.write(ch);
        }
        return swapStream.toString();
    }
}