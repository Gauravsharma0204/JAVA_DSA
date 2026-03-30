import java.util.HashMap;

public class HashingFirst {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Gaurav");
        map.put(2, "Rahul");

        System.out.println(map.get(1)); // Gaurav

        map.remove(2);

        System.out.println(map.containsKey(2)); // false
    }
}