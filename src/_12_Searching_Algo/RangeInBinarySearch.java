package _12_Searching_Algo;

public class RangeInBinarySearch {
    void main(){
        int arr[] = {2,2,4,6,8,10,12,14,16,80,100,150,200};
        int range[] = findRange(arr, 12);
        System.out.println(range[0] + " , " + range[1]);

        int ans = rangeInBinarySearch(arr, 14, range[0], range[1]);
        if(ans == -1){
            System.out.println("Element Does Not Found : ");
        } else {
            System.out.println("Found Element is Index " + ans);
        }

    }

    static int[] findRange(int arr[], int target){
        int range[] = new int[2];
        int start = 0;
        int end = 1;

        while(arr[end] < target){
            start = end;
            end = 2 * end;
        }
        range[0] = start;
        range[1] = end;

        return range;
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
