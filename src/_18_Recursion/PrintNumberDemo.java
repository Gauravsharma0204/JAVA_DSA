public class PrintNumberDemo{
      static  void print(int n){
            if(n == 0){
                  return;
            }
            print(n-1);
            System.err.print(n + " ");
      }

      public static void main(String[] args) {
          PrintNumberDemo demo = new PrintNumberDemo();
          demo.print(10);
      }
}
