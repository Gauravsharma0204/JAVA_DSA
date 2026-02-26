package _06_OOPS;

class Car {
    String model; // Instance Feild
    private int speed;

    void accelerate(int delta){ // Behaviour Feild
        speed += delta;
    }

    int getSpeed(){
        return speed;
    }
}

public class ClassDemo {
    public static void main(String[] args){
        Car car = new Car();
        car.model = "Honda City";
        car.accelerate(60);

        System.out.println(car.model);
        System.out.println(car.getSpeed());

    }
}
