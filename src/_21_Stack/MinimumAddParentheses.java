class MinimumAddParentheses {

    public static void main(String[] args) {

        MinimumAddParentheses obj = new MinimumAddParentheses();

        System.out.println(obj.minAddToMakeValid("())"));   // 1
        System.out.println(obj.minAddToMakeValid("((("));   // 3
        System.out.println(obj.minAddToMakeValid("()"));    // 0
        System.out.println(obj.minAddToMakeValid("()))((")); // 4
    }

    public int minAddToMakeValid(String s) {

        int open = 0; // unmatched '('
        int add = 0;  // additions needed

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                open++;
            } else { // ')'
                if (open > 0) {
                    open--;  // match found
                } else {
                    add++;   // need extra '('
                }
            }
        }

        return add + open;
    }
}