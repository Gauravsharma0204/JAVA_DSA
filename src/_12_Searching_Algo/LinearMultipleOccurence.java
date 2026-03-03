package _12_Searching_Algo;

public class LinearMultipleOccurence {
    void main(){
        int arr[] = {2,4,6,8,10,12,14,16, 20,30,45,60,20};
        linearSear(arr, 20);
    }

    public static void linearSear(int arr[], int target) {
        int ans[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[k] = i;
                k++;
            }
        }
        if (k == 0) {
            System.out.println("Element is Not Present in the Array : ");
        } else {
            for(int i = 0; i < k; i++){
                System.out.println("Found the Element ar pos " + ans[i]);
            }

        }
    }
}
