class MinimumSwapsBracket {

    public static void main(String[] args) {

        MinimumSwapsBracket obj = new MinimumSwapsBracket();

        System.out.println(obj.minSwaps("[]][][")); // 2
        System.out.println(obj.minSwaps("[[][]]")); // 0
    }

    public int minSwaps(String s) {

        int open = 0;
        int imbalance = 0;
        int swaps = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '[') {
                open++;

                if (imbalance > 0) {
                    swaps += imbalance;
                    imbalance--;
                }

            } else { // ']'
                if (open > 0) {
                    open--;
                } else {
                    imbalance++;
                }
            }
        }

        return swaps;
    }
}