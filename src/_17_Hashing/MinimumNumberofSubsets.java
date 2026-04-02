import java.util.HashMap;
import java.util.HashSet;

public class MinimumNumberofSubsets {

    void main(){
        int arr[] = {2,1,4,1,6,5,5,5};
        int res = minimumNumberofSubsets(arr);
        System.out.println("Min Number of Subset -> " + res);
    }

    static int minimumNumberofSubsets(int arr[]){
        int res = 0;
        int n = arr.length;
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++){
            if ((visited[i])){
                continue;
            }
            res++;
            HashSet<Integer> set = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if(visited[j] || set.contains(arr[j])){
                    continue;
                }
                visited[j] = true;
                set.add(arr[j]);
            }
        }

        return res;
    }

    static int minimumNumberofSubsetsBetterAp(int arr[]){
        int maxFreq = 0;
        int n = arr.length;
        HashMap<Integer, Integer> freqmap = new HashMap<>();

        for (int i = 0; i < n; i++){
           freqmap.put(arr[i], freqmap.getOrDefault(arr[i],0)+1);
           maxFreq = Math.max(maxFreq, freqmap.get(arr[i]));
        }

        return maxFreq;
    }
}
