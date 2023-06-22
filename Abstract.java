// Abstract class (غیر مکمل کلاس)
abstract class Shape {
  String color;

  // Abstract method (غیر مکمل میتھڈ)
  abstract double calculateArea();

  void setColor(String color) {
    this.color = color;
  }
}

// Concrete class (مکمل کلاس)

class Rectangle extends Shape {
  double length;
  double width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Implementation of abstract method (غیر مکمل میتھڈ کی تنسیخ)
  double calculateArea() {
    return length * width;
  }
}

public class Abstract {
  public static void main(String[] args) {
    // Create an object of the Rectangle class
    Rectangle rectangle = new Rectangle(5, 7);
    rectangle.setColor("Blue");

    // Call the abstract method
    double area = rectangle.calculateArea();

    // Display the result
    System.out.println("Rectangle Area: " + area);
    System.out.println("Rectangle Color: " + rectangle.color);
  }
}
