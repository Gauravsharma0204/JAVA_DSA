package _12_Searching_Algo;

public class JumpSearch {
    void main(){
        int arr[] = {2,3,5,7,11,34,45,65,77};
        int index = jumpSearch(arr, 41);
        if(index == -1){
            System.out.println("Element not Found");
        } else {
            System.out.println("Found Element at Index : "+ index);
        }
    }

    public static int jumpSearch(int arr[], int target){
        int n = arr.length;
        int blocksize = (int) Math.sqrt(n);
        int startIndex = 0;
        int endIndex = blocksize;

        while (endIndex < n && arr[endIndex] <= target){
            startIndex = endIndex;
            endIndex += blocksize;
            if(endIndex > n){
                endIndex = n;
            }
        }
        int res = -1;
        for(int i = startIndex; i < endIndex; i++){
            if(target == arr[i]){
                res = i;
            }
        }
        return res;
    }


}
