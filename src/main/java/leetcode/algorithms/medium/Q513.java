package leetcode.algorithms.medium;

import leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2020.08.12
 */
public class Q513 {

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int ans = root.val;
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.right != null) {
                q.offer(temp.right);
                ans = temp.right.val;
            }
            if (temp.left != null) {
                q.offer(temp.left);
                ans = temp.left.val;
            }
        }
        return ans;
    }

}
