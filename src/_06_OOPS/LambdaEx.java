import java.util.*;

public class LambdaEx {

    static class Student1 {
        int rollNo;
        String name;
        int marks;

        public Student1(int rollNo, String name, int marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {

        List<Student1> list = new ArrayList<>();

        list.add(new Student1(3, "Amit", 50));
        list.add(new Student1(1, "Ravi", 70));
        list.add(new Student1(2, "Neha", 80));

        // Increasing Order (Marks)
        Collections.sort(list, (s1, s2) -> {
            if(s1.marks == s2.marks){
                return s1.rollNo - s2.rollNo;
            }
            return s1.marks - s2.marks;
//            return s2.marks - s1.marks;
        });

        for (Student1 s : list) {
            System.out.println(s.rollNo + " " + s.name + " " + s.marks);
        }
    }
}
