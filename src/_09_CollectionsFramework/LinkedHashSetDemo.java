package _09_CollectionsFramework;

import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetDemo {
    void main(){
        Set<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(10);
        System.out.println(set);

        for(Integer element : set){
            System.out.println(element + " ");
        }

        set.remove(6);
        System.out.println(set.contains(10));

        for(Integer element : set){
            System.out.println(element + " ");
        }
    }
}
