package _10_Math_for_DSA;

public class OddEven {
    void main(){
        oddEven(8);
    }
    public static void oddEven(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
