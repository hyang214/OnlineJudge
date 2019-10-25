package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.10.25
 */
public class Q0003 {

    /**
     * 暴力枚举
     * @param s
     * @return
     */
    public int bruteForce(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        /** 记录最大匹配 **/
        int max = 0;
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < chars.length; i ++) {
            Set<Character> set = new HashSet<>();
            int currentLength = 0;
            for (int j = i; j < chars.length; j ++) {
                if (set.contains(chars[j])) {
                    break;
                } else {
                    set.add(chars[j]);
                    currentLength ++;
                }
            }
            if (currentLength > max) {
                max = currentLength;
            }
        }
        return max;
    }

    
}
