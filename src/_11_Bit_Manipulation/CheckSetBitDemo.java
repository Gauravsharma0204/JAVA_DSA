package _11_Bit_Manipulation;

public class CheckSetBitDemo {
    public boolean checkSetBit(int num, int k){
        return ((1<<k) & num) != 0;
    }

    void main(){
        int k = 1;
        int num = 13;
        CheckSetBitDemo cb = new CheckSetBitDemo();
        if(cb.checkSetBit(num, k)){
            System.out.println("K th Bit of " + num + " was set, K = " + k);
        } else {
            System.out.println("K th Bit of " + num + " was not set, K = " + k);
        }
    }
}
