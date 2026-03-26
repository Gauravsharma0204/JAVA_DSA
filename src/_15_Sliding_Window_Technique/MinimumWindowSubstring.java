package _15_Sliding_Window_Technique;

import java.util.HashMap;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Store frequency of t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int start = 0, end = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;
        int count = map.size();

        while (end < s.length()) {
            char endChar = s.charAt(end);

            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);

                if (map.get(endChar) == 0) {
                    count--;
                }
            }

            // When all characters matched
            while (count == 0) {
                // Update minimum window
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    startIndex = start;
                }

                char startChar = s.charAt(start);

                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);

                    if (map.get(startChar) > 0) {
                        count++;
                    }
                }

                start++;
            }

            end++;
        }

        return minLen == Integer.MAX_VALUE ? ""
                : s.substring(startIndex, startIndex + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBNC";
        String t = "ABCD";

        System.out.println(minWindow(s, t)); // Output: BANC
    }
}