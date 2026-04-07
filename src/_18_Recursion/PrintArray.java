class PrintArray{

      static void printArray(int index, int arr[]){
            if(index == arr.length){
                  return;
            }
            System.out.print(arr[index] + " ");
            printArray(index + 1, arr);
      }


      public static void main(String[] args){
            int arr[] = {7,6,5,7,9,8,2,5,3};
            printArray(0, arr);
      }
}