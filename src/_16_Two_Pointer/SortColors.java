package _16_Two_Pointer;

public class SortColors {

    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};

        sortColours(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortColours(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        int index = 0;

        while (index <= end){
            if(arr[index] == 0){
                swap(arr, index, start);
                index++;
                start++;
            }
            else if (arr[index] == 2) {
                swap(arr, index, end);
                end--;
            }
            else {
                index++;
            }
        }
    }
}