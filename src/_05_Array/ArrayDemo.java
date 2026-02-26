package _05_Array;

public class ArrayDemo {
    void main(String[] args){
//      Fisrt Way to Declare Array
        int arr[] = {1,2,3,4,5,6};
        System.out.println(arr[2]);

//      Second Way to Declare Array
        int arr2[] = new int[5];
        arr2[0] = 20;
        arr2[1] = 30;
        arr2[2] = 40;
        arr2[3] = 50;
        arr2[4] = 60;

//      Travers Array
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }

//       String
        String str[] = {"Gaurav", "Kritika", "Mohit", "Abhinav"};
        for (int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }


    }
}
