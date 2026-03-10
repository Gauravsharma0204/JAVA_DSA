package _12_Searching_Algo;

public class SearchInsertPosition {

        void main(){
            int arr[] = {1,2,3,4,5,6,8,9};
            int ans = searchInsert(arr, 5);
            System.out.println(ans);
        }


        public int searchInsert(int[] nums, int target) {

            int start = 0, end = nums.length - 1;

            while(start <= end){
                int mid = (start + end)/2;

                if(nums[mid] == target)
                    return mid;

                if(nums[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }

            return start;
        }
}
