package _13_Sorting_Algo;

public class FirstmissingPos {

    public static void main(String[] args) {
        int arr[] = {3, 4, -1, 1};
        int ans = firstMissingPositive(arr);
        System.out.println("First Missing Positive: " + ans);
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        int n = arr.length;

        // Step 1: Cyclic Sort
        while (i < n) {
            int correctIndex = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // Step 2: Find missing positive
        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }

        return n + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}