package leetcode.algorithms.medium;

import org.junit.Test;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2020.12.13
 */
public class SubrectangleQueriesTest {

    @Test
    public void test() {
        int[][] r = {
                {1, 2, 1},
                {4, 3, 4},
                {3, 2, 1},
                {1, 1, 1}
        };
        SubrectangleQueries queries = new SubrectangleQueries(r);
        queries.getValue(0, 2);
        queries.updateSubrectangle(0, 0, 3, 2, 5);
        queries.getValue(0, 2);
        queries.getValue(3, 1);
        queries.updateSubrectangle(3, 0, 3, 2, 10);
        queries.getValue(3, 1);
        queries.getValue(0, 2);
    }

}
