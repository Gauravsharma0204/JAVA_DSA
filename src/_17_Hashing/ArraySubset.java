import java.util.HashMap;

public class ArraySubset {

    public static void main(String[] args) {

        ArraySubset obj = new ArraySubset();

        long a1[] = {1, 2, 3, 4, 5};
        long a2[] = {2, 3, 5};

        long n = a1.length;
        long m = a2.length;

        String result = obj.isSubset(a1, a2, n, m);

        System.out.println(result);
    }

    public String isSubset(long a1[], long a2[], long n, long m){
        HashMap<Long, Integer> freqMap = new HashMap<>();

        for (long element : a1){
            freqMap.put(element, freqMap.getOrDefault(element, 0 )+1);
        }

        for (long element : a2){
            if(freqMap.containsKey(element) && freqMap.get(element) > 0) {
                freqMap.put(element, freqMap.get(element) -1);
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
