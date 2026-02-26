

package _06_OOPS;

class Vehicale {
    String model; // Instance Feild
    private int speed;

    Vehicale(){
        model = "SUV";
        speed = 40;
    }

    void accelerate(int delta){ // Behaviour Feild
        speed += delta;
    }

    int getSpeed(){
        return speed;
    }
}

public class CunstructorDemo {
    public static void main(String[] args){
        Vehicale vehicale = new Vehicale();
        vehicale.model = "Honda City";
        vehicale.accelerate(60);

        System.out.println(vehicale.model);
        System.out.println(vehicale.getSpeed());

    }
}

