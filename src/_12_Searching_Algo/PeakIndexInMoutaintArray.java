package _12_Searching_Algo;

public class PeakIndexInMoutaintArray {
    void main(){
        int arr[] = {2,4,6,8,10,12,10,8,6,4,2,1};
        int arr1[] = {2,4,6,8,10,10,12,10,8,9,6,4,2,1};
        int ans = peakIndexMountainArray(arr);
        System.out.println(ans);
    }

    public int peakIndexMountainArray(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid != 0 && mid != n-1 && arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            } else if(mid != n-1 && arr[mid] < arr[mid+1]){
                start = mid+1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
