import java.util.*;

class MinAdjacentSwaps {

    public static void main(String[] args) {

        MinAdjacentSwaps obj = new MinAdjacentSwaps();

        System.out.println(obj.minSwaps("[]][][")); // 2
        System.out.println(obj.minSwaps("]][["));   // 2
    }

    public int minSwaps(String s) {

        List<Integer> pos = new ArrayList<>();

        // Store positions of '['
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                pos.add(i);
            }
        }

        int p = 0;        // pointer to next '['
        int count = 0;    // balance
        int swaps = 0;

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '[') {
                count++;
                p++;
            } else { // ']'
                count--;
            }

            // If imbalance (more ']' than '[')
            if (count < 0) {

                // swap current ']' with next '['
                swaps += pos.get(p) - i;

                // actually swap in array (optional for logic clarity)
                char temp = arr[i];
                arr[i] = arr[pos.get(p)];
                arr[pos.get(p)] = temp;

                p++;
                count = 1; // reset balance
            }
        }

        return swaps;
    }
}