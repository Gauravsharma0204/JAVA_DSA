package _03_Function;

public class FuncOverloading {

    public static void main(String[] args){
        FuncOverloading fun = new FuncOverloading();
        System.out.println( fun.add(20,30,40));
    }

    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public int add(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }

    public float add(float a, float b){
        float sum = a + b;
        return sum;
    }

    public long add(long a, long b){
        long sum = a + b;
        return sum;
    }
}
