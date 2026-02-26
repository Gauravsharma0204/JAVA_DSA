package _09_CollectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    void main(){
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Gaurav");
        map.put(2, "Kitika");
        map.put(3, "Nikhil");
        map.put(4, "Disha");
        System.out.println(map);

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

//      Print Using Keys
        System.out.println();
        System.out.println("Print Using Keys");
        for(Integer key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }

        //Print Using Keys
        System.out.println();
        System.out.println("Print Using Values");
        for(String name : map.values()){
            System.out.println(name + " -> " + map.values());
        }

        System.out.println(map.containsKey(19));
        System.out.println(map.containsValue("Gaurav"));

        String fullName = map.get(1) + "Sharma";
        map.put(1, fullName);
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }



    }
}
