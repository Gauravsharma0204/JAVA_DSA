
class LastOccurrence{

      static int lastOccurrence(int arr[], int index, int target){
            if(index == arr.length){
                  return -1;
            }

            int res = lastOccurrence(arr, index+1, target);

            if(res == -1){
                  if(arr[index] == target){
                        return index;
                  }
            }

            return res;
      }



      public static void main(String args[]){
             int arr[] = {7,6,5,7,9,8,2,5,3};
             int target = 5;
             int res = lastOccurrence(arr, 0, target);
             
             if(res == -1){
                  System.out.println(target + " is not present in Array");
            } else {
                  System.out.println("First Occurrene of " + target + " in array is : " + res);
            }


      }
}