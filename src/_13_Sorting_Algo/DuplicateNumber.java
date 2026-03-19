package _13_Sorting_Algo;

public class DuplicateNumber {

    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 4, 2, 3};
        int ans = duplicateNumber(arr);
        System.out.println("Duplicate Number: " + ans);
    }

    static int duplicateNumber(int arr[]) {
        int i = 0;
        int n = arr.length;

        while (i < n) {
            if (arr[i] != i) {
                int expectedIndex = arr[i];

                if (arr[i] == arr[expectedIndex]) {
                    return arr[i]; // 🔥 duplicate found
                }

                swap(arr, i, expectedIndex);
            } else {
                i++;
            }
        }

        return -1;
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}