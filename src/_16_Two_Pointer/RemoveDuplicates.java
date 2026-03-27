package _16_Two_Pointer;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,4,5,5,6,6,7,7,8,8,8,8,9};

        int newLength = removeDuplicatesSortedArray(arr);

        // Print unique elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicatesSortedArray(int[] nums){
        int n = nums.length;

        if (n == 0) return 0;

        int k = 0;

        for (int i = 1; i < n; i++) {
            if(nums[i] != nums[k]){
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}