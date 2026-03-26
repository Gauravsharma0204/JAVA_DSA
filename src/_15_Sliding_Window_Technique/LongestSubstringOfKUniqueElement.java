package _15_Sliding_Window_Technique;

public class LongestSubstringOfKUniqueElement {

    public int longestKSubstr(String s, int k){
        int n = s.length();
        int windowStart = 0;
        int windowEnd = 0;
        int len = 0;
        int maxLen = Integer.MIN_VALUE;
        int freqHash[] = new int[26];
        int uniqueCharCount = 0;

        while(windowEnd < n){
            int index = s.charAt(windowEnd) - 97;

            if(freqHash[index] == 0){
                uniqueCharCount++;
            }
            freqHash[index]++;

            if(uniqueCharCount == k){
                len = windowEnd - windowStart + 1;
                maxLen = Math.max(maxLen, len);
            }
            else if(uniqueCharCount > k){
                while (uniqueCharCount > k){
                    int startIndex = s.charAt(windowStart) - 97;
                    freqHash[startIndex]--;

                    if(freqHash[startIndex] == 0){
                        uniqueCharCount--;
                    }
                    windowStart++;
                }
            }
            windowEnd++;
        }
        return (maxLen == Integer.MIN_VALUE) ? -1 : maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringOfKUniqueElement obj = new LongestSubstringOfKUniqueElement();

        String s = "aabacbebebe";
        int k = 3;

        int result = obj.longestKSubstr(s, k);

        System.out.println("Longest substring length with " + k + " unique characters: " + result);
    }
}