package _05_Array;

public class ArrayWithShifting {
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

        ArrayWithShifting ar = new ArrayWithShifting();
        ar.insertWithShifting(arr, 25,1);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public void insertWithShifting(int arr[], int element, int index){
        if(index < 0 || index >= arr.length){
            System.out.println("Index out of Bound");
            return;
        }

        for (int i = arr.length - 2; i >= index; i--){
                arr[i+1] = arr[i];
        }
        arr[index] = element;
    }
}
