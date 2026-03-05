package _12_Searching_Algo;

public class CountAllOccurBinarySearch {
    void main(){
        int arr[] = {4,4,8,8,8,15,16,23,23,42};
        int first = binarySearchFirstLastOccu(arr, 8, true); // First Occurence
        int last = binarySearchFirstLastOccu(arr, 8, false); // Last Occurence
        if(first == -1){
            System.out.println("There is Not a Any Elements");
        } else {
            System.out.println("Occurance of Target is : " + (last - first + 1));
        }
    }

    static int binarySearchFirstLastOccu(int arr[], int target, boolean isFirst){
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
        return ans;

    }
}
