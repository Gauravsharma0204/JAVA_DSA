package _16_Two_Pointer;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1};

        System.out.println(countOnes(arr));
    }

    static int countOnes(int num[]){
        int max = 0;
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            if(num[i] == 1){
                count++;
                max = Math.max(max, count); // update here
            } else {
                count = 0; // reset on 0
            }
        }
        return max;
    }
}