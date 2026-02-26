package _07_Exception;

public class Finally {
    public static void main(String[] args){
        int num = 0;
        try{
            num = 10 / 0;
        } catch (Exception e) {
            System.out.println("Caught an Exception : " + e);
            return;
        } finally {
            System.out.println("Program Ends Here ");
        }
        System.out.println("Result is : " + num);
    }
}
