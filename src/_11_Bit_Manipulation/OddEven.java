package _11_Bit_Manipulation;

public class OddEven {
    public static boolean oddEven(int num){
        if((num & 1) == 0){
            return true;
        }
        return false;
    }

    void main(){
        int num = 20;
        String res = oddEven(num) ? "Even" : "Odd";
        System.out.println(num + " is " + res);
    }

}
