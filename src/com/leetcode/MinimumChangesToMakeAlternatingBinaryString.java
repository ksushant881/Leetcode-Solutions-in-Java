package com.leetcode;

public class MinimumChangesToMakeAlternatingBinaryString {
    public static int minOperations(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                ans++;
                char x = s.charAt(i) == '1' ? '0' : '1';
                s = s.substring(0, i) + x + s.substring(i + 1);
            }
        }
        return Math.min(ans, n - ans);
    }

    public static void main(String[] args) {
        System.out.println(minOperations("0100"));
        System.out.println(minOperations("10"));
        System.out.println(minOperations("1111"));
        System.out.println(minOperations("10010100"));
    }
}
