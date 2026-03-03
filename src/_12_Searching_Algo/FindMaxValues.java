package _12_Searching_Algo;

public class FindMaxValues {
    void main(){
        int arr[] = {2,4,6,8,10,12,14,16, 20,30,45,60,20};
        maxNum(arr);
    }

    public static void maxNum(int arr[]){
//        int max = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum Number : " + max);
    }

}
