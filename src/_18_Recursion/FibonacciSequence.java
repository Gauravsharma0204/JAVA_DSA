
class FibonacciSequence{

      static int fib(int n){
            if(n <= 1){
                  return n;
            }
            return fib(n - 1) + fib(n-2);

      }

      public static void main(String[] args){
            int fibo = fib(20);
            System.out.println("Sum of Fibonacci Sequence " + fibo);
     


            int n = 20; // number of terms
            for(int i = 0; i < n; i++){
                  System.out.print(fib(i) + " ");
            }
     
      }
}