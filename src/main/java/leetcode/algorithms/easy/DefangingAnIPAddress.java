package leetcode.algorithms.easy;

/**
 * title: 1108. Defanging an IP Address
 *      https://leetcode.com/problems/defanging-an-ip-address
 *
 * @author Hao YANG
 * @since 2020.12.23
 */
public class DefangingAnIPAddress {

    public interface Approach {
        String defangIPaddr(String address);
    }

    /**
     * 直接使用正则替换，性能较差
     */
    public static class Simple implements Approach {

        @Override
        public String defangIPaddr(String address) {
            return address.replaceAll("\\.", "[.]");
        }

    }

    /**
     * 通过字符操作进行判断，性能更佳
     */
    public static class CharBase implements Approach {

        @Override
        public String defangIPaddr(String address) {
            char[] origin = address.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < origin.length; i ++) {
                if (origin[i] == '.') {
                    sb.append("[.]");
                } else {
                    sb.append(origin[i]);
                }
            }
            return sb.toString();
        }

    }

    public static void main(String[] args) {
        System.out.println(new CharBase().defangIPaddr("1.1.1.1"));
    }

}
