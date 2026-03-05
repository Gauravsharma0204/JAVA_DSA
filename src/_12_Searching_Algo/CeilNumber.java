package _12_Searching_Algo;

public class CeilNumber {
    void main(){
        int arr[] = {4,4,8,8,8,15,16,23,23,42};
        int ans = binarySearchCeilValues(arr, 20);
        System.out.println("Ceil Values is : " + ans);
    }

    static int binarySearchCeilValues(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                ans = arr[mid];
                break;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
                ans = arr[mid];
            }
        }
        return ans;

    }
}
