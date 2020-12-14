package leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * title: 1431. Kids With the Greatest Number of Candies
 *  https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
 *
 * @author Hao YANG
 * @since 2020.12.14
 */
public class KidsWithTheGreatestNumberOfCandies {


    public interface Approach {

        List<Boolean> kidsWithCandies(int[] candies, int extraCandies);

    }

    /**
     * 暴力方式
     *  问题拆解成2个问题
     *  + 找到最大值 max
     *  + 对于每个位置，如果 candies[i] + extraCandies >= max，那么true，否则false
     */
    public static class BruteForce implements Approach {

        @Override
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = 0;
            for (int i = 0; i < candies.length; i ++) {
                max = Math.max(max, candies[i]);
            }
            List<Boolean> result = new ArrayList<>(candies.length);
            for (int i = 0; i < candies.length; i ++) {
                result.add(candies[i] + extraCandies >= max);
            }
            return result;
        }

    }

}
