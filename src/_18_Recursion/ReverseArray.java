class ReverseArray{

      static void printArray(int index, int arr[]){
            if(index == arr.length){
                  return;
            }
      
            printArray(index + 1, arr);
            System.out.print(arr[index] + " ");
      }


      public static void main(String[] args){
            int arr[] = {7,6,5,7,9,8,2,5,3};
            printArray(0, arr);
      }
}