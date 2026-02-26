package _10_Math_for_DSA;

public class ArmstrongNumber {
    public boolean isArmstrong(int num){
        if (num < 0) return false;
        int res = 0;
        int copy = num;
        int digits = (int)Math.log10(num) + 1;
        while (num > 0){
            int digit = num % 10;
            res = res + (int)Math.pow(digit, digits);
            num = num / 10;
        }
        return (copy == res);
    }

    public static void main(String[] args){
        ArmstrongNumber ad = new ArmstrongNumber();
        int num = 153;
        System.out.println("is " + num + " Armstrong -> " + ad.isArmstrong(num));
    }

}
