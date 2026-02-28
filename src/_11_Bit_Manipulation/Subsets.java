package _11_Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        int subsets = 1<<len;
        for(int i = 0; i < subsets; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < len; j++){
                if((i & (1 << j)) != 0){
                    list.add(nums[j]);
                }
            }
            res.add(list);
        }
        return res;
    }

    void main(){
        int arr[] = {1,2,3};
        System.out.println(subsets(arr) + " ");
    }
}
