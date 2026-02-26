package _10_Math_for_DSA;

public class ExponentsDemo {
    void main(){
        exponentsDemo(10,-3);
    }
    public static void exponentsDemo(int a, int b){
        boolean isNeg = false;
        if(b < 0){
            b = -1 * b;
            isNeg = true;
        }
        double res = 1;
        for(int i = 0; i < b; i++){
            res *= a;
        }
        if(isNeg){
            res = 1 / res;
        }
        System.out.println("Power is : " + res);
    }
}
