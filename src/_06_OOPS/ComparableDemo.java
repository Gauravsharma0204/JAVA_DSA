
import java.util.*;

class Students implements Comparable<Students>{
    int rollNo;
    String name;
    int marks;

    public Students(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Students that){
        if(this.rollNo < that.rollNo){
            return -1;
        } else {
            return 1;
        }
    }
}

public class ComparableDemo {
    public static void main(String[] args){
        List<Students> list = new ArrayList<>();
        list.add(new Students(3, "Amit", 50));
        list.add(new Students(1, "Ravi", 70));
        list.add(new Students(2, "Neha", 80));

        Collections.sort(list);
        for (Students s : list){
            System.out.println(s.rollNo + " " + s.name + " " + s.marks);
        }
    }
}
