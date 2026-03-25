package _15_Sliding_Window_Technique;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProblem {

    public long findMinDiff(ArrayList<Integer> a, int n, int m){
        if(a.size() == 0 || m == 0){
            return 0;
        }

        Collections.sort(a);
        long res = Long.MAX_VALUE;

        for (int i = 0; i < n - m + 1; i++){
            int minElement = a.get(i);
            int maxElement = a.get(i + m - 1);
            res = Math.min(res, maxElement - minElement);
        }
        return res;
    }

    public static void main(String[] args) {

        ChocolateDistributionProblem obj = new ChocolateDistributionProblem();

        ArrayList<Integer> chocolates = new ArrayList<>();

        chocolates.add(7);
        chocolates.add(3);
        chocolates.add(2);
        chocolates.add(4);
        chocolates.add(9);
        chocolates.add(12);
        chocolates.add(56);

        int n = chocolates.size(); // total packets
        int m = 5; // students

        long result = obj.findMinDiff(chocolates, n, m);

        System.out.println("Minimum Difference is: " + result);
    }
}