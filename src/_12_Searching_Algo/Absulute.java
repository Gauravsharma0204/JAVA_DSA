package _12_Searching_Algo;

public class Absulute {

    public static void main(String[] args){
        int arr[] = {2,2,4,6,8,10,12,14,16,18};
        findMinimumAbsoluteDiff(arr, 11);
    }

    static void findMinimumAbsoluteDiff(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

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

        int res;

        if(ans != -1){
            res = 0;
        }
        else{
            if(end < 0){
                res = Math.abs(target - arr[start]);
            }
            else if(start >= arr.length){
                res = Math.abs(target - arr[end]);
            }
            else{
                int diff1 = Math.abs(target - arr[start]);
                int diff2 = Math.abs(target - arr[end]);
                res = Math.min(diff1, diff2);
            }
        }

        System.out.println("Minimum Absolute Difference : " + res);
    }
}