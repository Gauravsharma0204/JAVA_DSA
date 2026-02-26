package _10_Math_for_DSA;

public class AllDivisors {

    public static void main(String[] args) {

        int num = 50;

        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){

                System.out.println(i);

                if(i != num / i){   // avoid duplicate for perfect square
                    System.out.println(num / i);
                }
            }
        }
    }
}