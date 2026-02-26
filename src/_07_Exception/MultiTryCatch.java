package _07_Exception;

public class MultiTryCatch {
    public static void main(String[] args){
        try {
            int arr[] = {1,2,3};
            System.out.println(arr[2]);

            String s = "Gaurav ";
            System.out.println(s.length());

            System.out.println(5/0);
        } catch (ArithmeticException e){
            System.out.println("You Can't Divide By Zero " + e);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Either array index problem or Null Pointer problem : " + e);
        }
    }
}
