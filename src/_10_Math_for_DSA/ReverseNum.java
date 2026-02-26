package _10_Math_for_DSA;

public class ReverseNum {
    void main(){
        reverse(253524);
    }

    public static void reverse(int num){
        int res = 0;
        while(num > 0){
            int d = num % 10;
            res = res * 10 + d;
            num = num/10;
        }
        System.out.println(res);
    }
}
