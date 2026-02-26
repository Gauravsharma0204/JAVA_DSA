package _10_Math_for_DSA;

public class EuclidiamAlgo {
    void main(){
        int a = 30;
        int b = 18;
        System.out.println("GDC of " + a + " and " + b + " is : " + findGcd(a, b));
    }
    public int findGcd(int a, int b){
        if(b > a){
            return findGcd(b, a);
        }
        while (b > 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
