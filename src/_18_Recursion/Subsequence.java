public class Subsequence {

    public static void printSubsequence(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Take first character
        char ch = str.charAt(0);

        // Remaining string
        String ros = str.substring(1);

        // Include the character
        printSubsequence(ros, ans + ch);

        // Exclude the character
        printSubsequence(ros, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequence(str, "");
    }
}