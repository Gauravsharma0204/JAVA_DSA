package _17_Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWithKSum {

    public static void main(String[] args) {
        int arr[] = {2, 8, 2, 6, -6, 3, 2};

        ArrayList<Integer> res = findKSumSubArray(arr, 12);

        if (res.get(0) == -1) {
            System.out.println("Not Found");
            return;
        }

        System.out.println("Res -> [" + res.get(0) + "," + res.get(1) + "]");
    }

    static ArrayList<Integer> findKSumSubArray(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> myMap = new HashMap<>();
        myMap.put(0, -1);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum - k;

            if (myMap.containsKey(rem)) {
                int start = myMap.get(rem) + 1;

                list.add(start);
                list.add(i);

                return list;
            }

            myMap.put(sum, i);
        }

        // if not found
        list.add(-1);
        list.add(-1);

        return list;
    }
}