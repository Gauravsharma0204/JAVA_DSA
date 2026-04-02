import java.util.HashMap;

class SubarraySum {

    public int subarraySum(int[] arr, int k) {
        int count = 0, sum = 0;

        HashMap<Integer, Integer> sumFreqMap = new HashMap<>();
        sumFreqMap.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            int rem = sum - k;

            count += sumFreqMap.getOrDefault(rem, 0);

            sumFreqMap.put(sum, sumFreqMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        SubarraySum obj = new SubarraySum();

        int[] arr = {1, 1, 1};
        int k = 2;

        int result = obj.subarraySum(arr, k);

        System.out.println("Total subarrays with sum " + k + " = " + result);
    }
}