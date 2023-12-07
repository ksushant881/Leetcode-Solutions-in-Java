package com.leetcode;

public class LargestOddNumberinString {
    public static String largestOddNumber(String num) {
        int n = num.length();
        String ans = "";
        for (int i = n - 1; i >= 0; i--) {
            if (Integer.parseInt(String.valueOf(num.charAt(i))) % 2 != 0) {
                ans = num.substring(0, i+1);
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
    }
}
