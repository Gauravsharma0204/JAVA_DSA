package _12_Searching_Algo;

public class FindMaxSubArray {

    public static void main(String[] args){

        int arr[][] = {
                {1,2,3},
                {4,1,6},
                {7,8,1}
        };

        findMaxSumArray(arr);
    }

    public static void findMaxSumArray(int arr[][]){

        int max = Integer.MIN_VALUE;
        int resIndex = -1;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if(sum > max){
                max = sum;
                resIndex = i;
            }
        }

        System.out.println("Row with Maximum Sum: " + resIndex);
        System.out.println("Maximum Sum: " + max);
    }
}