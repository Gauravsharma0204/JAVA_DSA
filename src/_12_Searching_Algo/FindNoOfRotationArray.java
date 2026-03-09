package _12_Searching_Algo;

public class FindNoOfRotationArray {

    public static void main(String[] args) {

        int arr[] = {15,18,2,3,6,12};

        int res = findRotationCount(arr);

        System.out.println("Rotation Count = " + res);
    }

    static int findRotationCount(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            // already sorted
            if(arr[start] <= arr[end]){
                return start;
            }

            int mid = start + (end - start) / 2;

            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;

            // mid is minimum
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }

            // left sorted
            if(arr[start] <= arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }
}