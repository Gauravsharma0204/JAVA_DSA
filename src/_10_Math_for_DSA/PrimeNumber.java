package _10_Math_for_DSA;

public class PrimeNumber {
    void main(){
        System.out.println(primeNumber(13));
    }

    public static boolean primeNumber(int num){
        if(num <= 1){
            return false;
        }
//        boolean isPrime = true;

        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
