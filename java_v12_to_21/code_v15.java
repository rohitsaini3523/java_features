package java_v12_to_21;
public class code_v15 {

    public sealed class Vehicle permits Car, Bike, Truck {
        public void start() {
            System.out.println("Vehicle is starting.");
        }
    }
    
    final class Car extends Vehicle {
        public void drive() {
            System.out.println("Car is driving.");
        }
    }
    
    final class Bike extends Vehicle {
        public void ride() {
            System.out.println("Bike is riding.");
        }
    }
    
    final class Truck extends Vehicle {
        public void haul() {
            System.out.println("Truck is hauling.");
        }
    }
    
}
