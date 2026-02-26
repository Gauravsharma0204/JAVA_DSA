package _03_Function;

public class Func {

    public void printName(String name){
        System.out.print("Name is --> " + name);
    }

    public int multiply(int a, int b){
        int res = a * b;
        return res;
    }

    public static void main(String[] args){
        Func fu = new Func();
        fu.printName("Gaurav");
        int mul = fu.multiply(5,5);
        System.out.println("\nMultiply --> " + mul);

    }


}
