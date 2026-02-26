package _10_Math_for_DSA;

public class PallidromNum {
    void main(){
        int num = 1234;
        System.out.println(pallidrom(num));
    }
    public static boolean pallidrom(int num){
        int original = num;
        int res = 0;
        while(num > 0){
            int d = num % 10;
            res = res * 10 + d;
            num = num / 10;
        }
        return (res == original);
    }
}
