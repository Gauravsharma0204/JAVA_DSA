package _06_OOPS;

abstract class Shape{
    Shape(){
        System.out.println("I am Shaped");
    }

    abstract void area();

    void display(){
        System.out.println("This is Shape");
    }
}

class Circle extends Shape{
    double radius;
    Circle(double r){
        this.radius = r;
    }
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area : " + area);
    }
}

class Ractangle extends Shape {
    double length, width;

    Ractangle(double l, double w){
        this.length = l;
        this.width = w;

    }
    void area(){
        double area = length * width;
        System.out.println("Rectangle area : " + area);
    }
}


public class AbstractClass {
    public static void main(String[] args){
        Shape s1 = new Circle(5);
        Shape s2 = new Ractangle(4, 6);
        s1.area();
        s2.area();
        s1.display();
    }
}
