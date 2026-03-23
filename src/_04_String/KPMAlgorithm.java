package _04_String;

    class KMPAlgorithm {

        // Step 1: Create LPS Array
        static int[] computeLPS(String pattern) {
            int m = pattern.length();
            int[] lps = new int[m];

            int len = 0; // previous longest prefix suffix
            int i = 1;

            while (i < m) {
                if (pattern.charAt(i) == pattern.charAt(len)) {
                    len++;
                    lps[i] = len;
                    i++;
                } else {
                    if (len != 0) {
                        len = lps[len - 1];
                    } else {
                        lps[i] = 0;
                        i++;
                    }
                }
            }
            return lps;
        }

        // Step 2: KMP Search
        static void KMPsearch(String text, String pattern) {
            int n = text.length();
            int m = pattern.length();

            int[] lps = computeLPS(pattern);

            int i = 0; // index for text
            int j = 0; // index for pattern

            while (i < n) {
                if (text.charAt(i) == pattern.charAt(j)) {
                    i++;
                    j++;
                }

                if (j == m) {
                    System.out.println("Pattern found at index: " + (i - j));
                    j = lps[j - 1];
                }
                else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                    if (j != 0) {
                        j = lps[j - 1];
                    } else {
                        i++;
                    }
                }
            }
        }

        // Main function
        public static void main(String[] args) {
            String text = "ababcabcabababd";
            String pattern = "ababd";

            KMPsearch(text, pattern);
        }
    }

