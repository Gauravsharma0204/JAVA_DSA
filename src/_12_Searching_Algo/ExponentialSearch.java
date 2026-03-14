package _12_Searching_Algo;

public class ExponentialSearch {
    void main(){
        int arr[] = {2,3,5,7,11,34,45,65,77};
        int index = exponentialSearch(arr, 50);
        if(index == -1){
            System.out.println("Element not Found");
        } else {
            System.out.println("Found Element at Index : "+ index);
        }
    }

    public static int exponentialSearch(int arr[], int target){
        if(arr[0] == target){
            return 0;
        }
        int i = 1;
        int n = arr.length;

        while ((i < n && arr[i] <= target)){
            i = 2 * i;
        }
        int end = Math.max(i, n-1);
        int index = rangeInBinarySearch(arr, target,i/2, end);

        return index;
    }

    static int rangeInBinarySearch(int arr[], int target, int start, int end){
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                ans = mid;
                break;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
