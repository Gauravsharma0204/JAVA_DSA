package _12_Searching_Algo;

public class FindMinValues {
    void main(){
        int arr[] = {2,4,6,8,10,12,14,16, 20,30,45,60,1,20};
        minNum(arr);
    }

    public static void minNum(int arr[]){
//        int min = arr[0];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum Number : " + min);
    }

}
