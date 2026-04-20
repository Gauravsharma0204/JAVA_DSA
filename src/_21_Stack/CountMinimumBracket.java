import java.util.Stack;

class CountMinimumBracket {

    public static void main(String[] args) {

        CountMinimumBracket obj = new CountMinimumBracket();

        String s1 = "}{{}}{{{";
        System.out.println(obj.countRev(s1)); // Output: 3

        String s2 = "{{{{";
        System.out.println(obj.countRev(s2)); // Output: 2
    }

    public int countRev(String s) {

        // If length is odd → impossible
        if (s.length() % 2 != 0) {
            return -1;
        }

        Stack<Character> stack = new Stack<>();

        // Step 1: Remove balanced pairs
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        // Step 2: Count remaining
        int open = 0, close = 0;

        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top == '{') {
                open++;
            } else {
                close++;
            }
        }

        // Step 3: Calculate reversals
        return (int)(Math.ceil(open / 2.0) + Math.ceil(close / 2.0));
    }
}