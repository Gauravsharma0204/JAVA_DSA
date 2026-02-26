package _10_Math_for_DSA;

public class InsertAtFront {
    void main(){
        insertInFront(65251, 2);
    }

    public void insertInFront(int num, int digit){
        int digits = (int)Math.log10(num) + 1;
        int res = digit * (int) Math.pow(10, digits) + num;
        System.out.println("New Number is : " + res);
    }
}
