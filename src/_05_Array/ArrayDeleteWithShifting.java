package _05_Array;

public class ArrayDeleteWithShifting {

        public static void main(String[] args){
            int arr[] = new int[5];
            arr[0] = 20;
            arr[1] = 30;
            arr[2] = 40;
            arr[3] = 50;
            arr[4] = 60;

//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

            _05_Array.ArrayDeleteWithShifting ar = new _05_Array.ArrayDeleteWithShifting();
            ar.deleteWithShifting(arr,1);
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }

        }

        public void deleteWithShifting(int arr[], int index){
            if(index < 0 || index >= arr.length){
                System.out.println("Index out of Bound");
                return;
            }

            for (int i = index + 1; i < arr.length; i++){
                arr[i-1] = arr[i];
            }
            arr[arr.length - 1] = 0;
        }

}
