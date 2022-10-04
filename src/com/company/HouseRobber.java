package com.company;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 22;
        arr[1] = 3;
        arr[2] = 31;
        arr[3] = 64;
        int k = rob(arr);
        System.out.println(k);
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[] dp = new int[n];
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        ans = dp[n - 1];
        return ans;
    }
}
//2 1 1 2
//2
