package _12_Searching_Algo;

import static _12_Searching_Algo.BinarySearch.binarySearch;

public class BinarySearchOrderAgnostic {
    void main(){
        int arr[] = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
        int arr1[] = {30,28,26,24,22,20,18,16,14,12,10,8,6,4,2};
        binarySearchOrderAgnostic(arr, 16);
        binarySearchOrderAgnostic(arr1, 20);

    }

    public static void binarySearchOrderAgnostic(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        if(arr[start]<=arr[end]){
            binarySearch(arr, target);
        } else {
            binarySearchDecreOrder(arr, target);
        }
    }

    static void binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                System.out.println("Found Element " + target + " At Index : " + mid);
                return;  // element mil gaya toh exit
            }
            else if (arr[mid] < target){
                start = mid + 1;   // RIGHT SIDE
            }
            else {
                end = mid - 1;     // LEFT SIDE
            }
        }

        System.out.println("Element Not Found");

    }


    static void binarySearchDecreOrder(int arr[], int target){
            int start = 0;
            int end = arr.length - 1;

            while (start <= end){
                int mid = start + (end - start) / 2;

                if(arr[mid] == target){
                    System.out.println("Found Element " + target + " At Index : " + mid);
                    return;  // element mil gaya toh exit
                }
                else if (arr[mid] < target){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            System.out.println("Element Not Found");

        }
}
