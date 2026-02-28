package _11_Bit_Manipulation;

public class BitFlip {
        public static int minBitFlips(int start, int goal) {
            int xor = start ^ goal;
            int count = 0;
            while(xor > 0){
                xor = xor & (xor-1);
                count++;
            }
            return count;
        }

    public static void main(String[] args) {
        int start = 10;
        int goal = 7;

        int result = minBitFlips(start, goal);
        System.out.println("Minimum Bit Flips: " + result);
    }


}
