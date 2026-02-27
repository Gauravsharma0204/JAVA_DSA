package _11_Bit_Manipulation;

public class RightMOstSetBit {
    private int rightMostSetBit(int num){
        return (num & -num);
    }
    void main(){
        int num = 12;
        RightMOstSetBit cb = new RightMOstSetBit();
        int res = cb.rightMostSetBit(num);
        System.out.println("Res With Only Right Most Set Bit of " + num + " is: " + res);
    }
}
