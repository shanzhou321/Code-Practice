/**
 * Copyright (c) 2015 hzhou, All rights reserved.
 */
package tech.saltyegg.leetcode;

import tech.saltyegg.leetcode.parent.ListNode;
import tech.saltyegg.leetcode.parent.TreeNode;

/**
 * Description: Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced
 * BST.
 *
 * @author hzhou
 * <p>
 * http://www.programcreek.com/2013/01/leetcode-convert-sorted-list-to-binary-search-tree-java/
 */

// TODO: Important
public class ConvertSortedListToBST {

    ListNode crtHead;

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        crtHead = head;
        int length = 0;
        ListNode cursor = head;
        while (cursor != null) {
            length++;
            cursor = cursor.next;
        }

        return helper(0, length - 1);

    }

    private TreeNode helper(int start, int end) {
        if (start > end) {
            return null;
        }

        int middle = (start + end) / 2;
        TreeNode left = helper(start, middle - 1);
        TreeNode root = new TreeNode(crtHead.val);
        crtHead = crtHead.next;
        TreeNode right = helper(middle + 1, end);
        root.left = left;
        root.right = right;
        return root;
    }
}