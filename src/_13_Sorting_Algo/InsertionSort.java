package _13_Sorting_Algo;

public class InsertionSort {

    void main(){
        int arr[] = {2,5,3,1,7,8,9,6,4};
        insertionSort(arr);

        // Print Sorted Array
        for(int num : arr){
            System.out.print(num + " ");
        }
    }


    static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
//          Shifting Logic
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
