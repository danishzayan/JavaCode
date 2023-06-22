// Superclass (پدر کلاس)
class Vehicle {
  String brand;

  void drive() {
    System.out.println("Driving a vehicle");
  }
}

// Subclass (بیٹا کلاس)
class Car extends Vehicle {
  int numberOfDoors;

  void accelerate() {
    System.out.println("Accelerating the car");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    // Create an object of the Car class
    Car myCar = new Car();

    // Access inherited member from the superclass
    myCar.brand = "Toyota";
    System.out.println("Brand: " + myCar.brand);

    // Access member of the subclass
    myCar.numberOfDoors = 4;
    System.out.println("Number of Doors: " +

        myCar.numberOfDoors);

    // Call inherited method from the superclass
    myCar.drive();

    // Call method of the subclass
    myCar.accelerate();
  }
}
