import java.util.Scanner;

public class RemoveCharFromString {

    static String removeChar(String str, char ch) {
        // Base case
        if (str.length() == 0) {
            return "";
        }

        // Process first character
        char first = str.charAt(0);

        // Recursive call on remaining string
        String remaining = removeChar(str.substring(1), ch);

        // If match, skip
        if (first == ch) {
            return remaining;
        } else {
            return first + remaining;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        String result = removeChar(str, ch);

        System.out.println("Result: " + result);
    }
}