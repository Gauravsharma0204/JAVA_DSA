package _12_Searching_Algo;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10, 25, 30, 45, 50};
        int target = 10;
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Element not found");
        }
    }
}
