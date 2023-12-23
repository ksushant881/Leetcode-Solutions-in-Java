package com.leetcode;

import com.leetcode.Utils.Pair;

import java.util.HashSet;

public class PathCrossing {
    public static boolean isPathCrossing(String path) {
        HashSet<Pair<Integer, Integer>> st = new HashSet<>();
        st.add(new Pair<>(0, 0));
        int currX = 0, currY = 0;
        Pair newPos;
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N':
                    currY++;
                    break;
                case 'E':
                    currX++;
                    break;
                case 'W':
                    currX--;
                    break;
                case 'S':
                    currY--;
                    break;
            }
            newPos = new Pair<>(currX, currY);
            if (st.contains(newPos)) {
                return true;
            }
            st.add(newPos);
//            System.out.println(st);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPathCrossing("NESWW"));
    }
}
