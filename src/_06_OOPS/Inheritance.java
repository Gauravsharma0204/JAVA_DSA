package _06_OOPS;

class Animal{
    void eat(){
        System.out.println("Animal Eats Food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}



public class Inheritance {
    public static void main(String[] args){
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
