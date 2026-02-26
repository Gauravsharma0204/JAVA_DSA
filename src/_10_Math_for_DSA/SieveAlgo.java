package _10_Math_for_DSA;

import java.util.Arrays;

public class SieveAlgo {
    void main(){
        allPrimeNumber(30);
    }

    public static void allPrimeNumber(int num){
        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++){
            if(arr[i]){
                for(int j = i*i; j <= num; j = j+i){
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if(arr[i]){
                System.out.println(i + " ");
            }
        }
    }
}
