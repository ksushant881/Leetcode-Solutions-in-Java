package com.leetcode;

import com.leetcode.Utils.TreeNode;

import java.util.*;

public class AddOneRowtoTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int currDepth = 1;

        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val, root, null);
            return newRoot;
        }

        while (!q.isEmpty()) {
            if (currDepth == depth - 1) {
                List<TreeNode> arr = new ArrayList<>(q);
                for (int i = 0; i < arr.size(); i++) {
                    TreeNode curr = arr.get(i);
                    TreeNode prevLeft = curr.left;
                    TreeNode prevRight = curr.right;

                    curr.left = new TreeNode(val, prevLeft, null);
                    curr.right = new TreeNode(val, null, prevRight);

                }
            }

            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.peek();
                q.remove();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            currDepth++;
        }
        return null;
    }
}
