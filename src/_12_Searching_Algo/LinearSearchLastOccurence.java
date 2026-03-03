package _12_Searching_Algo;

public class LinearSearchLastOccurence {

        void main(){
            int arr[] = {2,4,6,8,10,12,14,16, 20,30,45,60,20};
            linearSear(arr, 20, true);
        }

        public static void linearSear(int arr[], int target, boolean findlast){
            int ans = -1;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == target){
                    ans = i;
                    if(findlast == false){
                        break;
                    }
                }
            }
            if(ans == -1){
                System.out.println("Element is Not Present in the Array : ");
            } else {
                System.out.println("Found the Element ar pos " + ans);
            }
        }

}
