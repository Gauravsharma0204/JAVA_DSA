package _12_Searching_Algo;

public class LinearSear2DArray {
    void main(){
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        linearSear2DArrya(arr, 9);
    }

    public static void linearSear2DArrya(int arr[][], int target){
        int outer = -1;
        int inner = -1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr[i].length; j++){
                if (arr[i][j] == target){
                    outer = i;
                    inner = j;
                    break;
                }
            }
        }
        if(outer == -1){
            System.out.println("The Element is Not FOunded : ");
        } else{
            System.out.println("The Element is Found at Index Number : " + outer + "," + inner);
        }
    }
}
