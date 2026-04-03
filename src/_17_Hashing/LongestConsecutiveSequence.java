import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        // Step 2: Check sequences
        for (int num : set) {

            // Start of sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                // Expand sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr));
    }
}