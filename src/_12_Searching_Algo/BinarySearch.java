package _12_Searching_Algo;

public class BinarySearch {

    void main(){
        int arr[] = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
        binarySearch(arr, 20);
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
}
