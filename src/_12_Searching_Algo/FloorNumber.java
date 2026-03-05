package _12_Searching_Algo;

import java.lang.annotation.Target;

public class FloorNumber {
    void main(){
        int arr[] = {4,4,8,8,8,15,16,23,23,42};
        int ans = binarySearchFloorValues(arr, 3);
        System.out.println("Floor Values is : " + ans);
    }

    static int binarySearchFloorValues(int arr[], int target){
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
                ans = arr[mid];
            }
            else {
                end = mid - 1;
            }
        }
        return ans;

    }
}
