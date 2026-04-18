import java.util.Stack;

class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();

        String s = "{[()][]{}}";
        System.out.println(obj.isValid(s)); // true

        String s2 = "{[(])}";
        System.out.println(obj.isValid(s2)); // false
    }

    public boolean isValid(String s) {
        int n = s.length();

        if (n % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                // ✅ FIRST check empty
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if (ch == ')' && top != '(') return false;
                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}