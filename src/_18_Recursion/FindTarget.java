
class FindTarget{

      static boolean findTarget(int arr[], int index, int target){
            if(index == arr.length){
                  return false;
            }

            if(index == target){
                  return true;
            }

            return findTarget(arr, index+1, target);
      }



      public static void main(String args[]){
             int arr[] = {7,6,5,7,9,8,2,5,3};
             int target = 6;
             boolean res = findTarget(arr, 0, target);
             System.out.println(res);


      }
}