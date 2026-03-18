package _13_Sorting_Algo;

public class BrickSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};

        brickSort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void brickSort(int arr[]) {
        int n = arr.length;
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;

            // Odd phase
            for(int i = 1; i <= n - 2; i += 2) {
                if(arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    isSorted = false;
                }
            }

            // Even phase
            for(int i = 0; i <= n - 2; i += 2) {
                if(arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    isSorted = false;
                }
            }
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}