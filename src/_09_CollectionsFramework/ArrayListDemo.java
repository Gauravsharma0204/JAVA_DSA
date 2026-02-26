package _09_CollectionsFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Student{
    int rollNo;
    String name;
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString(){
        return "[" + this.rollNo + " , " +  this.name + "]";
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student s){
            return this.rollNo == s.rollNo && this.name == s.name;
        }
        return false;
    }
}

public class ArrayListDemo {
    void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Add The Array");
        list.add(20);//Add At a Starting
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Add the Array at The Index");
        list.add(0, 10);

        System.out.println("Replace the Values");
        list.set(3, 45);

        System.out.println("Add the Values at The Beginning");
        list.addFirst(5);

        System.out.println("Add the Values at The Last");
        list.addLast(60);


        System.out.println("Print the Values : ");
        System.out.println(list);
        System.out.println(list.get(1));


        System.out.println("Create Own List : ");
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(1, "Gaurav"));
        list2.add(new Student(2, "kritika"));
//        System.out.println(list2);

        list2.remove(new Student(2, "kritika"));

        //Iterate
        System.out.println("Simple Iterate");
        ListIterator<Student> listIterator = list2.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

//        Reverse Iterate
        System.out.println("Reverse Iterate");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

//        Enhance For Loop
        System.out.println("Enhance For Loop");
        for(Student st : list2){
            System.out.println(st);
        }

//        Remove the Value at the Index
        System.out.println("Remove the Value at the Index");
        list.remove(1);
        System.out.println(list);

//        Remove the Particular Value
        System.out.println("Remove the Particular Value");
        list.remove(Integer.valueOf(20));
        System.out.println(list);



        System.out.println(list.size());
        System.out.println(list2.size());

    }
}
