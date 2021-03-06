/**
 * Copyright (c) 2015 hzhou, All rights reserved.
 */
package tech.saltyegg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: Given a collection of numbers, return all possible permutations.
 * <p>
 * For example, [1,2,3] have the following permutations: [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 *
 * @author hzhou
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        helper(nums, result, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, List<List<Integer>> result, List<Integer> crt) {
        if (crt.size() >= nums.length) {
            result.add(new ArrayList<>(crt));
            return;
        }

        for (int num : nums) {
            if (!crt.contains(num)) {
                crt.add(num);
                helper(nums, result, crt);
                crt.remove(crt.size() - 1);
            }

        }

    }
}