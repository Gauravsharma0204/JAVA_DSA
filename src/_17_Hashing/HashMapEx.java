package _17_Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    static void main(String[] args){
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Gaurav");
        myMap.put(2, "Abhinav");
        myMap.put(3, "Ayush");
        myMap.put(4, "Shyam");
        System.out.println(myMap);

        myMap.put(3, "Kritika");
        System.out.println(myMap);

        System.out.println(myMap.get(4));

        System.out.println(myMap.containsKey(5));

        System.out.println(myMap.getOrDefault(5, "Not Present"));

        myMap.replace(4, "Amit");
        System.out.println(myMap);

        for(Map.Entry<Integer, String> entry : myMap.entrySet()){
            System.out.println("key -> " + entry.getKey());
            System.out.println("Value -> " + entry.getValue());
        }


        for (Integer key : myMap.keySet()){
            System.out.println("Key -> " + key);
            System.out.println("Value -> " + myMap.get(key));
        }
    }



}
