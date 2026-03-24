package _15_Sliding_Window_Technique;

import java.util.ArrayList;

public class MaxSumSubarray {

    static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        int n = arr.length;

        System.out.println("Brute Force = " + maxSumSubarray(arr, k));

        // convert array to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        System.out.println("Sliding Window = " + maximumSumSubarray(k, list, n));
    }


    static int maxSumSubarray(int arr[], int k){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n-k; i++) {
            int sum = 0;
            for (int j = i; j < i+k; j++) {
                sum = sum + arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }


//    Using Sliding Window
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        long maxSum = 0;
        long sum = 0;
        int index = 0;
        while (index < N && index < K){
            sum += Arr.get(index);
            index++;
        }
        maxSum = sum;
        for (int i = 1; i < N-K+1; i++) {
            int prevElement = Arr.get(i - 1);
            int nextElement = Arr.get(i+K-1);
            sum = sum - prevElement + nextElement;
            maxSum = Math.max(maxSum, sum);

        }
        return maxSum;
    }
}
