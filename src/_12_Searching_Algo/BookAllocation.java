package _12_Searching_Algo;

import java.util.*;

public class BookAllocation {

    public static void main(String[] args) {

        int[] arr = {12, 34, 67, 90};
        int students = 2;

        int result = findPages(arr, students);

        System.out.println("Minimum pages = " + result);
    }

    public static int findPages(int[] arr, int k) {

        int n = arr.length;

        // If students are more than books
        if (k > n) {
            return -1;
        }

        int start = 0;
        int end = 0;

        // Find max element and total sum
        for (int a : arr) {
            start = Math.max(start, a);
            end += a;
        }

        int ans = -1;

        // Binary Search
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isAllocationPossible(arr, mid, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    private static boolean isAllocationPossible(int arr[], int maxPages, int students) {

        int studentCount = 1;
        int pages = 0;

        for (int a : arr) {

            if (pages + a <= maxPages) {
                pages += a;
            } else {
                studentCount++;
                pages = a;

                if (studentCount > students) {
                    return false;
                }
            }
        }

        return true;
    }
}
