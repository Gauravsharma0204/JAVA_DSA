package _11_Bit_Manipulation;

public class PowerDemo {
    private boolean isPowerOfTwo(int num){
        return ((num & num - 1) == 0);
    }

    void main(){
        int num = 18;
        PowerDemo pw = new PowerDemo();
        boolean res = pw.isPowerOfTwo(num);
        System.out.println("Is " +num+ "Power of 2 ? : " + res);
    }
}
