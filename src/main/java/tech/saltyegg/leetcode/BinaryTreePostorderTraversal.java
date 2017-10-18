package tech.saltyegg.leetcode;

import tech.saltyegg.leetcode.parent.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzhou on 4/28/15. codeashobby@gmail.com
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }

        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root != null && root.left == null && root.right == null) {
            result.add(root.val);
        } else {

            if (root.left != null) {
                helper(root.left, result);
            }

            if (root.right != null) {
                helper(root.right, result);
            }
            result.add(root.val);
        }
    }
}
