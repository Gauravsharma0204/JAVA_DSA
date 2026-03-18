package _13_Sorting_Algo;

public class CountingSortAlgo {
    public static void main(String[] args) {
        int arr[] = {5,7,3,2,2,1,3,3,8,9,10};
        int ans[] = countSort(arr);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] countSort(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int val : arr){
            max = Math.max(max, val);
        }

        int count[] = new int[max + 1];

        // Frequency
        for(int val : arr){
            count[val]++;
        }

        // Prefix Sum (FIXED LOOP)
        for (int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }

        int n = arr.length;
        int res[] = new int[n];

        // Placement
        for(int i = n-1; i >= 0; i--){
            int val = arr[i];
            int pos = count[val] - 1;

            res[pos] = val;
            count[val]--;
        }

        return res;
    }
}
