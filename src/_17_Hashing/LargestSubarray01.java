import java.util.HashMap;

public class LargestSubarray01 {

    public static int maxLen(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            // Convert 0 → -1
            if (arr[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }

            // If sum becomes 0
            if (sum == 0) {
                maxLen = i + 1;
            }

            // If sum seen before
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 1, 0};
        System.out.println(maxLen(arr));
    }
}