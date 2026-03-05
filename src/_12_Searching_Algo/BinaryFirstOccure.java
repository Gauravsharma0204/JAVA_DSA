package _12_Searching_Algo;

public class BinaryFirstOccure {
    void main(){
        int arr[] = {2,2,4,4,4,6,7,8,9,10,11,23};
        binarySearchFirstLastOccu(arr, 4, true); // First Occurence
        binarySearchFirstLastOccu(arr, 4, false); // Last Occurence

    }

    static void binarySearchFirstLastOccu(int arr[], int target, boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                ans = mid;
                if(isFirst){
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        if(ans != -1)
            System.out.println("Element Found at Index: " + ans);
        else
            System.out.println("Element Not Found");

    }
}
