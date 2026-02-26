package _07_Exception;

public class Throw {
    public static void main(String[] args){
        try {
            checkAge(15);
        } catch (Exception e){
            System.out.println("Exception Caught : " + e);
        }
    }

    public static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Age must be 18 or Above : ");
        } else {
            System.out.println("You are Allowed to Vote : ");
        }
    }
}
