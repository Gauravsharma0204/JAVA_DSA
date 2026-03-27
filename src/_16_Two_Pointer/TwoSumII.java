package _16_Two_Pointer;

import java.util.Arrays;

public class TwoSumII {

    void main(){
        int arr[] = {5,6,8,10,14,15,18};
        int t = 25;
        System.out.println(Arrays.toString(sum(arr, t)));
    }


    static int[] sum(int[] numbers, int target){
        int i = 0;
        int j = numbers.length-1;
        while (i<j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                return new int[]{i+1, j+1};
            }
            if(sum < target){
                i++;
            } else {
                j--;
            }
        }
        return new int[]{};
    }
}
