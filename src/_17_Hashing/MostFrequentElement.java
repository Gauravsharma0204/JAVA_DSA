import java.util.HashMap;

public class MostFrequentElement {

    void main(){
        int arr[] = {2,1,7,8,2,1,9,10,9,9,2,8,2};
        int ans = mostFrequentElement(arr);
        System.out.println("Ans -> " + ans);
    }

    static int mostFrequentElement(int arr[]){
        HashMap<Integer, Integer> frewMap = new HashMap<>();
        int ans = -1;
        int maxFreq = 0;

        for(int i = 0; i < arr.length; i++){
            if(frewMap.containsKey(arr[i])){
                int val = frewMap.get(arr[i]);
                val += 1;
                frewMap.put(arr[i],val);
            } else {
                frewMap.put(arr[i], 1);
            }

            if(frewMap.get(arr[i]) > maxFreq){
                maxFreq = frewMap.get(arr[i]);
                ans = arr[i];
            }
        }
        return ans;
    }


}
