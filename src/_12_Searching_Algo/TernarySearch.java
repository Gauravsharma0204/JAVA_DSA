package _12_Searching_Algo;

public class TernarySearch {
        void main(){
            int arr[] = {2,3,5,7,11,34,45,65,77};
            int index = ternarySearch(arr, 65);
            if(index == -1){
                System.out.println("Element not Found");
            } else {
                System.out.println("Found Element at Index : "+ index);
            }
        }

        public static int ternarySearch(int arr[], int target){
            int start = 0;
            int end = arr.length - 1;

            int index = -1;

            while(start <= end){
               int mid1 = start + (end - start)/3;
               int mid2 = end - (end - start)/3;

               if(target <= arr[mid1]){
                   if(target == arr[mid1]){
                       index = mid1;
                       break;
                   }
                   end = mid1 - 1;
               } else if (target >= arr[mid2]) {
                   if (target == arr[mid2]){
                       index = mid2;
                       break;
                   }
                   start = mid2 + 1;
               } else {
                   start = mid1 + 1;
                   end = mid2 - 1;
               }
            }
            return index;
        }



}
