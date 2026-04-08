
class FirstOccurrence{

      static int findTarget(int arr[], int index, int target){
            if(index == arr.length){
                  return -1;
            }

            if(arr[index] == target){
                  return index;
            }

            return findTarget(arr, index+1, target);
      }



      public static void main(String args[]){
             int arr[] = {7,6,5,7,9,8,2,5,3};
             int target = 15;
             int res = findTarget(arr, 0, target);
             
             if(res == -1){
                  System.out.println(target + " is not present in Array");
            } else {
                  System.out.println("First Occurrene of " + target + " in array is : " + res);
            }


      }
}