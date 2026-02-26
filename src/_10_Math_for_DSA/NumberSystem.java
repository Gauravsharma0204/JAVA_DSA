package _10_Math_for_DSA;

public class NumberSystem {
    void main(){
        convertToDecimal("1111", 2);
    }
    public static void convertToDecimal(String input, int currentBase){
        int res = 0;
        int pos = 0;
        int len = input.length();
        for (int i = len-1; i >= 0; i--){
            int digit = input.charAt(i) - '0';
            res = res + digit * (int) Math.pow(currentBase,pos);
            pos++;
        }
        System.out.println("Converted number is : " + res);
    }
}
