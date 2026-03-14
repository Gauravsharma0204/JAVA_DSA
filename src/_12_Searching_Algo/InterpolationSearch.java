package _12_Searching_Algo;

public class InterpolationSearch {

    void main(){
        int arr[] = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
        int index = interpolationSearch(arr, 6);
        if(index == -1){
            System.out.println("Element not Found");
        } else {
            System.out.println("Found Element at Index : "+ index);
        }
    }

    public static int interpolationSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end && target >= arr[start] && target <= arr[end]){
            if(arr[start] == arr[end]){
                if(arr[start] == target){
                    ans = start;
                }
                break;
            }

            int pos = start + (target - arr[start]) * (end - start) / (arr[end] - arr[start]);
            if(arr[pos] == target){
                ans = pos;
                break;
            } else if(target < arr[pos]){
                end = pos + 1;
            } else {
                start = pos + 1;
            }
        }
        return ans;
    }
}
