package _04_String;

public class KAnagrams {

    boolean arekAnagrams(String s1, String s2, int k){
        int n = s1.length();
        int m = s2.length();

        if(n != m) return false;

        int freq[] = new int[26];

        // Count frequency of s1
        for(int i = 0; i < n; i++){
            freq[s1.charAt(i) - 'a']++;
        }

        // Reduce frequency using s2
        for (int j = 0; j < m; j++) {
            int index = s2.charAt(j) - 'a';
            if (freq[index] > 0){
                freq[index]--;
            }
        }

        int count = 0;

        // Count remaining characters
        for (int i = 0; i < 26; i++) {
            count += freq[i];
        }

        return (count <= k);
    }

    public static void main(String[] args) {
        KAnagrams obj = new KAnagrams();

        String s1 = "anagram";
        String s2 = "grammar";
        int k = 3;

        boolean result = obj.arekAnagrams(s1, s2, k);

        if(result){
            System.out.println("Yes, they are K-Anagrams");
        } else {
            System.out.println("No, they are not K-Anagrams");
        }
    }
}