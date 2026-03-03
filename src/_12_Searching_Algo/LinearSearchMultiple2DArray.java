package _12_Searching_Algo;

public class LinearSearchMultiple2DArray {

    public static void main(String[] args) {

        int arr[][] = {
                {1,2,3},
                {4,1,6},
                {7,8,1}
        };

        linearSearch2DArray(arr, 1);
    }

    public static void linearSearch2DArray(int arr[][], int target){

        int size = 0;

        for(int i = 0; i < arr.length; i++){
            size += arr[i].length;
        }

        int ans[][] = new int[size][2];
        int k = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

                if (arr[i][j] == target){

                    ans[k][0] = i;   // row
                    ans[k][1] = j;   // column
                    k++;
                }
            }
        }

        if(k == 0){
            System.out.println("Element Not Found");
        } else{
            for(int i = 0; i < k; i++){
                System.out.println("Element Found at Position: "
                        + ans[i][0] + "," + ans[i][1]);
            }
        }
    }
}