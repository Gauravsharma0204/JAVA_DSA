import java.util.HashMap;

public class LongestSubarrayDivisibleByK {

    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            int rem = sum % k;

            // Handle negative remainder
            if (rem < 0) {
                rem += k;
            }

            // If remainder is 0 → whole subarray valid
            if (rem == 0) {
                maxLen = i + 1;
            }

            // If remainder seen before
            if (map.containsKey(rem)) {
                int prevIndex = map.get(rem);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                // Store first occurrence only
                map.put(rem, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;

        System.out.println(longestSubarray(arr, k));
    }
}