
interface InterfaceExample {
  void display();

  void calculate(int x, int y);
}

class MyClass implements InterfaceExample {
  @Override
  public void display() {
    System.out.println("Method Display");
  }

  @Override
  public void calculate(int x, int y) {
    int sum = x + y;
    System.out.println("Sum:  " + sum);
  }
}

public class InterfaceExp {
  public static void main(String[] args) {

    MyClass obj = new MyClass();

    obj.display();

    obj.calculate(10, 5);
  }
}
