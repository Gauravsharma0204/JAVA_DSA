package _11_Bit_Manipulation;

public class UnsetBitDemo {
    public int checkUnSetBit(int num, int k){
        return (~(1<<k) & num);
    }

    void main(){
        int k = 2;
        int num = 13;
        UnsetBitDemo cb = new UnsetBitDemo();
        int res = cb.checkUnSetBit(num, k);
        System.out.println("After UnSetting Kth Bit, Res " + res);
    }
}
