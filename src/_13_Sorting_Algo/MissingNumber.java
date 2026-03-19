package _13_Sorting_Algo;

public class MissingNumber  {
    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 4};
        int ans = missingNumber(arr);
        System.out.println("Missing Number: " + ans);
    }

    static int missingNumber(int arr[]) {
        int i = 0;
        int n = arr.length;

        while (i < n) {
            int expectedIndex = arr[i];

            if (expectedIndex < n && arr[i] != arr[expectedIndex]) {
                swap(arr, i, expectedIndex);
            } else {
                i++;
            }
        }

        // find missing number
        for (int j = 0; j < n; j++) {
            if (arr[j] != j) return j;
        }

        return n;
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}