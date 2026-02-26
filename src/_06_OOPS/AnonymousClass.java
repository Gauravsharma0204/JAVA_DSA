import java.util.*;

class Anonymous {

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

//        (First, Second)
//        Dec -> Second - First
//        Inc -> First - Second
        // Using Comparator with Anonymous Class
        Collections.sort(list, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
//                if (o1.marks < o2.marks) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//             return o2.marks - o1.marks; // Dec
             return o1.marks - o2.marks; // Inc

            }
        });

        for (Student1 s : list) {
            System.out.println(s.rollNo + " " + s.name + " " + s.marks);
        }
    }
}
