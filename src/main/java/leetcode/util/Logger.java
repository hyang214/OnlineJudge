package leetcode.util;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2020.12.22
 */
public class Logger {

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i ++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }


}
