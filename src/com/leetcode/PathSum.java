package com.leetcode;


import com.leetcode.Utils.TreeNode;

public class PathSum {
    private boolean solve(TreeNode root, int currSum, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && root.val + currSum == targetSum) return true;

        return solve(root.left, currSum + root.val, targetSum) || solve(root.right, currSum + root.val, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, 0, targetSum);
    }
}
