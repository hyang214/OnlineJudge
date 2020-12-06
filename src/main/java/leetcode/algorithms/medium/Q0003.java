package leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

    /**
     * 跳过非重复片段，减少重复计算
     * @param s
     * @return
     */
    public int smarter(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        /** 存储当前字符串对应的位置 **/
        Map<Character, Integer> location = new HashMap<>();
        int truncate = -1;
        String tmp = "";
        int max = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i ++) {
            if (location.containsKey(chars[i])) {
                /** 处理重复字符 **/
                /** 获取当前长度，更新最大长度 **/
                int currentLen = tmp.length();
                if (currentLen > max) {
                    max = currentLen;
                }
                /** 获取需要被截断的字符串，将其从location中删除，截断生成新的串 **/
                int occurrence = location.get(chars[i]);
                int index = occurrence - truncate;
                for (int j = 0 ; j < index; j ++) {
                    location.remove(tmp.charAt(j));
                }
                tmp = tmp.substring(index);
                truncate = occurrence;
            } else {
                /** 对应字符未重复 **/
            }
            location.put(chars[i], i);
            /** 长度增长 **/
            tmp = tmp + chars[i];
        }
        /** 最后一个字符导致的增长 **/
        int currentLen = tmp.length();
        if (currentLen > max) {
            max = currentLen;
        }

        return max;
    }

    /**
     * 减少非不要操作，根据双指针进行计算
     * @param s
     * @return
     */
    public int smarterOptimizer(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        /** 存储当前字符串对应的位置 **/
        Map<Character, Integer> location = new HashMap<>();
        int max = 0;
        int pre = -1;
        char[] chars = s.toCharArray();
        for (int current = 0; current < chars.length; current ++) {
            if (location.containsKey(chars[current])) {
                /** 处理重复字符 **/
                /** 更新指针 **/
                pre = Math.max(location.get(chars[current]), pre);
            } else {
                /** 对应字符未重复 **/
            }
            /** 获取当前长度，更新最大长度 **/
            max = Math.max(current - pre, max);
            /** 更新存储 **/
            location.put(chars[current], current);
        }

        return max;
    }

}
