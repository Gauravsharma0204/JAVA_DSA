package _11_Bit_Manipulation;

public class SetBitDemo {
    public int setBitDemo(int num, int k){
        return (1<<k | num);
    }

    void main(){
        int k = 2;
        int num = 20;
        SetBitDemo cb = new SetBitDemo();
        int res = cb.setBitDemo(num, k);
        System.out.println("After Setting Kth Bit, Res " + res);
    }
}
