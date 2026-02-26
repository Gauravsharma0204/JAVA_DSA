package _10_Math_for_DSA;

public class AppendDigit {
    void main(){
        appendDigit(25525,8);
    }

    public void appendDigit(int num, int digit){
        boolean isNeg = false;
        if(num < 0){
            isNeg = true;
            num = -1 * num;
        }
        int res = num * 10 + digit;
        if(isNeg){
            res = -1 * res;
        }
        System.out.println(res);
    }
}
