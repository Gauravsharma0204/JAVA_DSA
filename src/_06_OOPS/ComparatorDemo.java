
import java.util.*;

class Studentss{
    int rollNo;
    String name;
    int marks;

    public Studentss(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

}

class MyCustomComparator implements Comparator<Studentss>{

    @Override
    public int compare(Studentss s1, Studentss s2){
        if(s1.marks < s2.marks){
            return 1;
        } else {
            return -1;
        }
    }
}

public class ComparatorDemo {
    public static void main(String[] args){
        List<Studentss> list = new ArrayList<>();
        list.add(new Studentss(3, "Amit", 50));
        list.add(new Studentss(1, "Ravi", 70));
        list.add(new Studentss(2, "Neha", 80));

        Collections.sort(list, new MyCustomComparator());
        for (Studentss s : list){
            System.out.println(s.rollNo + " " + s.name + " " + s.marks);
        }
    }
}

