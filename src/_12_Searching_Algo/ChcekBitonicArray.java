package _12_Searching_Algo;

public class ChcekBitonicArray {

    void main(){
        int arr[] = {2,4,6,8,10,12,10,8,6,4,2,1};
        int arr1[] = {2,4,6,8,10,10,12,10,8,9,6,4,2,1};
        boolean ans = validMountainArray(arr);
        boolean ans1 = validMountainArray(arr1);
        System.out.println(ans);
        System.out.println(ans1);
    }

    public boolean validMountainArray(int[] arr){
        int index = 0;
        int n = arr.length-1;

//      Find all Increasing Seq(Find the Pick)
        while(index < n){
            if(arr[index] < arr[index+1]){
                index++;
            } else {
                break;
            }
        }
        if(index == 0 || index == n){
            return false;
        }

//      Find all Decreasing Seq(Find the end of The Array)
        while(index < n){
            if(arr[index] > arr[index+1]){
                index++;
            } else {
                break;
            }
        }
        return (index == n);


    }
}
