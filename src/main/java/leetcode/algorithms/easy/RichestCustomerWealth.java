package leetcode.algorithms.easy;

import java.util.Arrays;

/**
 * title: 1672 https://leetcode.com/problems/richest-customer-wealth/
 *
 *
 * @author Hao YANG
 * @since 2020.12.13
 */
public class RichestCustomerWealth {

    /**
     * 接口
     */
    public interface Approach {

        int maximumWealth(int[][] accounts);

    }

    /**
     * 最简单的遍历方法
     */
    public static class SimpleApproach implements Approach {

        @Override
        public int maximumWealth(int[][] accounts) {
            if (accounts.length == 0) {
                return 0;
            }
            int max = 0;
            for (int i = 0; i < accounts.length; i ++) {
                int sum = 0;
                for (int j = 0; j < accounts[i].length; j ++) {
                    sum += accounts[i][j];
                }
                max = Math.max(max, sum);
            }
            return max;
        }

    }

    /**
     * 使用stream
     * 性能较上一个方案差很多
     */
    public static class SimpleStreamApproach implements Approach {

        @Override
        public int maximumWealth(int[][] accounts) {
            if (accounts.length == 0) {
                return 0;
            }
            int max = 0;
            for (int i = 0; i < accounts.length; i ++) {
                int sum = Arrays.stream(accounts[i]).sum();
                max = Math.max(max, sum);
            }
            return max;
        }

    }

}
