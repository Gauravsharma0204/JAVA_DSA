package _11_Bit_Manipulation;

public class SingleNumber {
        public int singleNumber(int[] nums) {
            int xor = 0;
            for(int num : nums){
                xor = xor ^ num;
            }
            return xor;
        }
        void main(){
            int arr[] = {10, 20, 30, 40, 10, 20, 30};
            System.out.println(singleNumber(arr));
        }
}
