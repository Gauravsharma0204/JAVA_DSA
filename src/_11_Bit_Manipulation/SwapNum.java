package _11_Bit_Manipulation;

public class SwapNum {
    public static void swap(int a, int b){
        System.out.println("Before Swaping a : " + a + " b : " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swaping a : " + a + " b : " + b);
    }

    void main(){
        int a = 10;
        int b = 20;
        swap(a, b);
    }
}
