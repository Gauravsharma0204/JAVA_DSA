package _12_Searching_Algo;

public class SortedRotatedArrayII {

    void main(){
        int arr[] = {2,3,4,5,6,0,0,1,2};
        boolean res = SearchSortedRotatedArray(arr, 8);
        System.out.println("Result = " + res);
    }

    static boolean SearchSortedRotatedArray(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return true;
            }

            if(arr[start] == mid && arr[mid] == arr[end]){
                start++;
                end--;
            }  // Left side sorted
            else if(arr[start] <= arr[mid]){

                if(target >= arr[start] && target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right side sorted
            else {

                if(target > arr[mid] && target <= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
}
