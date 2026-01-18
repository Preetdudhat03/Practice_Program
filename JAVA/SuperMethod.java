//Super method

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    int numOfDoors;

    Car(String brand, int numOfDoors) {
        super(brand); // Invoking the constructor of the superclass (Vehicle)
        this.numOfDoors = numOfDoors;
    }

    void display() {
        super.display(); // Invoking the display method of the superclass
        System.out.println("Number of Doors: " + numOfDoors);
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
        myCar.display();
    }
}
