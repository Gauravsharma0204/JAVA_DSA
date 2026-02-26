package _10_Math_for_DSA;

public class NumOfDigit {
    void main(){
        int sum = sumOfDigit(0);
        System.out.println("Sum of Digit : " + sum);
    }

    public static int sumOfDigit(int num){
        if(num < 0){
            return -1 * num;
        }
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}
