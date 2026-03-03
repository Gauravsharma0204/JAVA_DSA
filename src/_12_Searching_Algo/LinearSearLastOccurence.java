package _12_Searching_Algo;

public class LinearSearLastOccurence {
    void main(){
        int arr[][] = {{1,2,3},
                {4,5,6},
                {7,8,1}};
//        linearSear2DArrya(arr, 1, true);   // true → last occurrence
        linearSear2DArrya(arr, 5, false);  // false → first occurrence
    }

    public static void linearSear2DArrya(int arr[][], int target, boolean lastOccu){
        int outer = -1;
        int inner = -1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr[i].length; j++){
                if (arr[i][j] == target){
                    outer = i;
                    inner = j;
                    if(lastOccu == false){
                        System.out.println("First Occurrence at Index: " + outer + "," + inner);
                        return;   // directly exit method
                    }

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
