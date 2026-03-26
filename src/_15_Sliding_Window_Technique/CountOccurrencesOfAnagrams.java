package _15_Sliding_Window_Technique;

import java.util.Arrays;

public class CountOccurrencesOfAnagrams {

    int search(String pat, String txt) {

        int patFreq[] = new int[26];
        int txtFreq[] = new int[26];

        int k = pat.length();
        int n = txt.length();

        // Pattern frequency
        for (int i = 0; i < k; i++) {
            patFreq[pat.charAt(i) - 'a']++;
        }

        // First window
        for (int i = 0; i < k; i++) {
            txtFreq[txt.charAt(i) - 'a']++;
        }

        int count = 0;

        if (Arrays.equals(txtFreq, patFreq)) {
            count++;
        }

        // Sliding window
        for (int i = 1; i <= n - k; i++) {

            // Remove previous char
            txtFreq[txt.charAt(i - 1) - 'a']--;

            // Add next char
            txtFreq[txt.charAt(i + k - 1) - 'a']++;

            if (Arrays.equals(txtFreq, patFreq)) {
                count++;
            }
        }

        return count;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        CountOccurrencesOfAnagrams obj = new CountOccurrencesOfAnagrams();

        String txt = "forxxorfxdofr";
        String pat = "for";

        int result = obj.search(pat, txt);

        System.out.println("Count of Anagrams = " + result);
    }
}