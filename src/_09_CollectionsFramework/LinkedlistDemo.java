package _09_CollectionsFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {
    void main(){
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.set(0, 30);
        
        list.remove(Integer.valueOf(10));
        System.out.println(list);
    }
}
