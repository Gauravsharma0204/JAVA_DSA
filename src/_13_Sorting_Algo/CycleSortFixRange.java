package _13_Sorting_Algo;

public class CycleSortFixRange {
    void main(){
        int arr[] = {3,2,5,4,1};
        CycleSortFixRange cs = new CycleSortFixRange();
        int res[] = cs.cycleSortFixRange(arr, 5);
        for(int ans : res){
            System.out.print(ans + " ");
        }
    }

    private int[] cycleSortFixRange(int arr[], int N){
        int i = 0;
        int n = arr.length;
        while (i < n){
            int expectedIndex = arr[i] - 1;
            if(expectedIndex >= n || arr[expectedIndex] == arr[i]){
                i++;
            } else {
                swap(arr, expectedIndex, i);
                }
            }
        return arr;
    }

    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
