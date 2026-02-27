package _11_Bit_Manipulation;

public class ToogleBitDemo {
    public int checkUnSetBit(int num, int k){
        return ((1<<k) ^ num);
    }

    void main(){
        int k = 1;
        int num = 13;
        ToogleBitDemo cb = new ToogleBitDemo();
        int res = cb.checkUnSetBit(num, k);
        System.out.println("After Toggling Kth Bit, Res " + res);
    }
}
