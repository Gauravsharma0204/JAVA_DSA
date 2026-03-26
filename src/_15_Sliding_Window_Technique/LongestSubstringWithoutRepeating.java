package _15_Sliding_Window_Technique;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s){
        int windowStart = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;

        for(int windowEnd = 0; windowEnd < n; windowEnd++){
            char ch = s.charAt(windowEnd);

            // If character already seen, move windowStart
            if(map.containsKey(ch)){
                windowStart = Math.max(windowStart, map.get(ch) + 1);
            }

            // Update latest index of character
            map.put(ch, windowEnd);

            maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeating obj = new LongestSubstringWithoutRepeating();

        String s = "abcabcbb";

        int result = obj.lengthOfLongestSubstring(s);

        System.out.println("Longest Substring Without Repeating Length: " + result);
    }
}