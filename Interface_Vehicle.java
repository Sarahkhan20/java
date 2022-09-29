import java.io.*;

interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Car implements Vehicle{
    int speed;
    int gear;
    public void changeGear(int newGear){
        gear = newGear;
    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("speed:"+ speed
        + "gear:"+ gear);
    }
}
class Bicycle implements Vehicle{

    int speed;
    int gear;
    public void changeGear(int newGear){

        gear = newGear;
    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

class Bike implements Vehicle {
    int speed;
    int gear;
    public void changeGear(int newGear){
        gear = newGear;
    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}
class GFG {
    public static void main (String[] args) {
        Car car = new Car();
        car.changeGear(5);
        car.speedUp(150);
        car.applyBrakes(50);
        System.out.println("Car present state :");
        car.printStates();
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(5);
        bicycle.speedUp(20);
        bicycle.applyBrakes(10);
        System.out.println("Bicycle present state :");
        bicycle.printStates();
        Bike bike = new Bike();
        bike.changeGear(5);
        bike.speedUp(90);
        bike.applyBrakes(50);
        System.out.println("Bike present state :");
        bike.printStates();
    }
}