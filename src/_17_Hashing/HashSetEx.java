import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    void main(){
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(6);
        set.add(10);
        set.add(8);
        set.add(2);
        set.add(12);

//        System.out.println(set);
//
//        set.add(6);
//        System.out.println(set);
//        System.out.println(set.contains(4));
//        System.out.println(set.remove(6));

        for (Integer i : set){
            System.out.println(i);
        }


        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }




    }
}
