package _12_Searching_Algo;

import java.util.*;

public class AggressiveCows {

    public static void main(String[] args) {

        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;

        int result = aggressiveCows(stalls, cows);

        System.out.println("Largest Minimum Distance = " + result);
    }

    public static int aggressiveCows(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int start = 1;
        int end = stalls[stalls.length - 1] - stalls[0];

        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (canPlaceCows(stalls, cows, mid)) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static boolean canPlaceCows(int[] stalls, int cows, int dist) {

        int cowCount = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - lastPosition >= dist) {
                cowCount++;
                lastPosition = stalls[i];
            }

            if (cowCount >= cows) {
                return true;
            }
        }

        return false;
    }
}