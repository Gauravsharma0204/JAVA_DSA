package _11_Bit_Manipulation;

public class SingleNUmberII {
        public int singleNumber(int[] nums) {
            int res = 0;
            for(int i = 0; i < 32; i++){
                int bitCount = 0;
                for(int num : nums){
                    if((num & (1<<i))!=0){
                        bitCount++;
                    }
                }
                if(bitCount % 3 != 0){
                    res = res | (1 << i);
                }
            }
            return res;
        }

    void main(){
        int arr[] = {10, 20, 30, 40, 10, 20, 30, 10, 20, 30};
        System.out.println(singleNumber(arr));
    }
}
