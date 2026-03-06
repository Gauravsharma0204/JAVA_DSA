package _12_Searching_Algo;

public class FindIndexInMountainArray {

    public static void main(String[] args) {

        int arr[] = {1,3,5,7,6,4,2};
        int target = 6;

        int ans = findIndex(arr, target);
        System.out.println(ans);
    }

    static int findIndex(int arr[], int target){

        int peak = findPeak(arr);

        int firstTry = binarySearch(arr, target, 0, peak, true);

        if(firstTry != -1){
            return firstTry;
        }

        return binarySearch(arr, target, peak+1, arr.length-1, false);
    }

    static int findPeak(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start < end){

            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }

    static int binarySearch(int arr[], int target, int start, int end, boolean isAsc){

        while(start <= end){

            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){

                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }else{

                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }

        }

        return -1;
    }
}