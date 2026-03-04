package _12_Searching_Algo;

public class BinarySearchDecreOrder {

    void main(){
            int arr[] = {30,28,26,24,22,20,18,16,14,12,10,8,6,4,2};
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
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            System.out.println("Element Not Found");

        }
}

