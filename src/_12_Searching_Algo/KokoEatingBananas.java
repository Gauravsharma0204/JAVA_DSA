package _12_Searching_Algo;

import java.util.*;

public class KokoEatingBananas {

    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);

        System.out.println("Minimum Eating Speed = " + result);
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = 0;

        for (int p : piles) {
            end = Math.max(end, p);
        }

        int ans = end;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (canEat(piles, mid, h)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static boolean canEat(int[] piles, int speed, int h) {

        int totalHours = 0;

        for (int p : piles) {

            totalHours += Math.ceil((double)p / speed);

            if (totalHours > h) {
                return false;
            }
        }

        return true;
    }
}
