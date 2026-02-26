package _10_Math_for_DSA;

public class GCD {
    void main(){
        int a = 12;
        int b = 18;
        System.out.println("GDC of " + a + " and " + b + " is : " + findGcd(a, b));
    }

    public static int findGcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
//      Cases for Handling Zero
        if(a == 0 && b == 0) return 0;
        if(a == 0) return b;
        if(b == 0) return a;
        int min = Math.min(a, b);
        int res = 1;
        for(int i = 2; i <= min; i++){
            if(a%i==0 && b%i==0){
                res = i;
            }
        }
        return res;
    }

}
