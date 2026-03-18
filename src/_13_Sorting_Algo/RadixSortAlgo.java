package _13_Sorting_Algo;

public class RadixSortAlgo {
    public static void main(String[] args) {
        int arr[] = {1, 603, 44, 7, 101, 67};

        RadixSortAlgo rd = new RadixSortAlgo();
        int res[] = rd.radixSort(arr);

        for(int ans : res){
            System.out.print(ans + " ");
        }
    }

    private int[] radixSort(int arr[]){
        int max = Integer.MIN_VALUE;

        for (int a : arr){
            max = Math.max(max, a);
        }

        int digits = (max == 0) ? 1 : (int)Math.log10(max) + 1;

        for (int d = 0; d < digits; d++){

            int count[] = new int[10];

            // count digits
            for(int a : arr){
                int digit = (a / (int)Math.pow(10, d)) % 10;
                count[digit]++;
            }

            // prefix sum
            for (int i = 1; i < 10; i++){
                count[i] += count[i-1];
            }

            int n = arr.length;
            int res[] = new int[n];

            // reverse for stability
            for (int i = n - 1; i >= 0; i--){
                int digit = (arr[i] / (int)Math.pow(10, d)) % 10;
                int pos = count[digit] - 1;

                res[pos] = arr[i];
                count[digit]--;
            }

            arr = res;
        }

        return arr;
    }
}