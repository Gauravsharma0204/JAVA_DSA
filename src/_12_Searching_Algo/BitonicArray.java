package _12_Searching_Algo;

public class BitonicArray {

    void main(){
        int arr[] = {2,4,6,8,10,13,11,7,5,1};
        smallestBitonicArray(arr);
    }

    static void smallestBitonicArray(int arr[]){
        int n = arr.length-1;
        if(arr[0] < arr[n]){
            System.out.println(arr[0]);
        } else {
            System.out.println(arr[n]);
        }
    }
}
