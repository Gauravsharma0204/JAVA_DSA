package _17_Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class SumOfSubArray {


    public static void main(String[] args) {
        int arr[] = {4, 2, -3, 1, 6};
        int K = 3;

        System.out.println(Arrays.toString(sumOfSubArray(arr, K)));

        System.out.println(checkSumSubarray(arr, K));
    }

    static int[] sumOfSubArray(int arr[], int k){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if(sum == k){
                    return new int[]{i, j}; // ✅ return indices
                }
            }
        }

        return new int[]{-1, -1}; // ❌ not found
    }

    static boolean checkSumSubarray(int arr[], int k){
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(0);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum-k;
            if(mySet.contains(rem)){
                return true;
            }
            mySet.add(sum);
        }
        return false;
    }

}