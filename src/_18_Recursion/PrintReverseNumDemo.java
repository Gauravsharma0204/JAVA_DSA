public class PrintReverseNumDemo{
      static  void print(int n){
            if(n == 0){
                  return;
            }
            System.err.print(n + " ");
            print(n-1);
      }

      public static void main(String[] args) {
          PrintReverseNumDemo demo = new PrintReverseNumDemo();
          demo.print(10);
      }
}

