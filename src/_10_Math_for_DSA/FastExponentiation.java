package _10_Math_for_DSA;

public class FastExponentiation {
    void main(){
        fastExponentiation(10,5);
    }

    public static void fastExponentiation(int a, int b){
        double res = 1.0;
        while(b > 0){
            if(b%2!=0){
                res = res * a;
                b--;
            }
            b=b/2;
            a = a*a;
        }
        System.out.println("Res is : " + res);
    }
}
