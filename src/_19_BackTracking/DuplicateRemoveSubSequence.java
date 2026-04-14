import java.util.*;

public class DuplicateRemoveSubSequence {

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 2, 3};
        List<List<Integer>> result = obj.subsets(nums);

        System.out.println("Subsets are:");
        for (List<Integer> subset : result) {
            System.out.print(subset + " ");
        }
    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        subsequences(0, nums, current, res);
        return res;
    }

    private void subsequences(int index, int nums[], List<Integer> current, List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }

        // include element
        current.add(nums[index]);
        subsequences(index + 1, nums, current, res);

        // exclude element
        current.remove(current.size() - 1);
         while((index+1) < nums.length && nums[index] == nums[index+1]){
            index++;
        }
        subsequences(index + 1, nums, current, res);
    }
}