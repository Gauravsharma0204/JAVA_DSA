package _10_Math_for_DSA;

public class Factorial {
    public static int factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
    void main(){
        System.out.println( factorial(5));

    }
}
