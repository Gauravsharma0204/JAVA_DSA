package _12_Searching_Algo;

public class MinElementInSortedRoratedArray {
    void main(){
        int arr[] = {2,3,4,5,6,1,2};
        int res = MinSortedRotatedArray(arr);
        System.out.println("Result = " + res);
    }

    static int MinSortedRotatedArray(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int minEle = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[start] <= arr[mid]){
                minEle = Math.min(minEle, arr[start]);
                start = mid+1;
            } else {
                minEle = Math.min(minEle, arr[mid]);
                end = mid - 1;
            }
        }
        return minEle;
    }
}
