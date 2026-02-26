package _06_OOPS;

//🔷 Important Symbols
//              Symbol	             Meaning
//               <T>	              Type
//               <K>	              Key
//               <V>	              Value
//               <?>	              Wildcard (any type)
//               <T extends Class>	  Bounded type

public class Generic {
    public static void main(String[] args){
//        IntegerDisplayer<Integer> obj = new IntegerDisplayer();
//        obj.setNum(50);
//        obj.display();
//
//        IntegerDisplayer<Double> obj1 = new IntegerDisplayer();
//        obj1.setNum(20.25);
//        obj1.display();

//        IntegerDisplayer<College> obj = new IntegerDisplayer<>();
//        obj.setNum(new College());
//        obj.display();

        IntegerDisplayer<Student> obj1 = new IntegerDisplayer<>();
        obj1.setNum(new Student());
        obj1.display();

        IntegerDisplayer<Teacher> obj2 = new IntegerDisplayer<>();
        obj2.setNum(new Teacher());
        obj2.display();

    }

}

class College {
    void printCollegeName(){
        System.out.println("IPEM Institute");
    }
}

class Student extends College{
    void printName(){
        System.out.println("Student Name Printed : ");
    }
}


class Teacher extends College{
    void printName(){
        System.out.println("Teacher Name Printed : ");
    }
}

//************************************************************************

//Generic
class IntegerDisplayer<T extends College>{
    T num;

    public void setNum(T num){
//        this.num.printCollegeName();
        this.num = num;
    }

    public void display(){
        System.out.println("Element -> " + this.num);
    }
}



//*****************************************************************
//Without Generic
//class IntegerDisplayer{
//    Integer num;
//
//    public void setNum(Integer num){
//        this.num = num;
//    }
//
//    public void display(){
//        System.out.println("Element -> " + this.num);
//    }
//}