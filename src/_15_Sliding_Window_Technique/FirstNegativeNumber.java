package _15_Sliding_Window_Technique;

public class FirstNegativeNumber {

    public long[] printFirstNegativeInteger(long A[], int N, int K) {

        java.util.Queue<Long> queue = new java.util.LinkedList<>();

        // First window
        int index = 0;
        while (index < K) {
            if (A[index] < 0) {
                queue.offer(A[index]);
            }
            index++;
        }

        long res[] = new long[N - K + 1];

        res[0] = queue.isEmpty() ? 0 : queue.peek();

        // Sliding window
        for (int i = 1; i < N - K + 1; i++) {

            if (A[i - 1] < 0) {
                queue.poll();
            }

            if (A[i + K - 1] < 0) {
                queue.offer(A[i + K - 1]);
            }

            res[i] = queue.isEmpty() ? 0 : queue.peek();
        }

        return res;
    }


    static void main(String[] args) {

        FirstNegativeNumber obj = new FirstNegativeNumber();

        long arr[] = { -8, 2, 3, -6, 10 };
        int N = arr.length;
        int K = 2;

        long result[] = obj.printFirstNegativeInteger(arr, N, K);

        System.out.println("First negative numbers in each window:");

        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}