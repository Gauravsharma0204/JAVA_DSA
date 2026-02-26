package _09_CollectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    void main(){
        Set<Integer> set = new TreeSet<>();
        set.add(6);
        set.add(8);
        set.add(10);
        set.add(2);
        set.add(4);
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
