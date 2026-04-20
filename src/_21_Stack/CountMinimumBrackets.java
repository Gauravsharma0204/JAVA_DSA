class CountMinimumBrackets {

    public static void main(String[] args) {

        CountMinimumBrackets obj = new CountMinimumBrackets();

        String s1 = "}{{}}{{{";
        System.out.println(obj.countRev(s1)); // 3

        String s2 = "{{{{";
        System.out.println(obj.countRev(s2)); // 2
    }

    public int countRev(String s) {

        // Odd length → impossible
        if (s.length() % 2 != 0) {
            return -1;
        }

        int open = 0;   // unmatched {
        int close = 0;  // unmatched }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{') {
                open++;
            } else { // ch == '}'
                if (open > 0) {
                    open--;  // match with previous {
                } else {
                    close++; // unmatched }
                }
            }
        }

        // Apply formula
        return (int)(Math.ceil(open / 2.0) + Math.ceil(close / 2.0));
    }
}