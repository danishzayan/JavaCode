class GenericClass<T, U> {
  private T value1;
  private U value2;

  public GenericClass(T value1, U value2) {
    this.value1 = value1;
    this.value2 = value2;
  }

  public T getValue1() {
    return value1;
  }

  public void setValue1(T value1) {
    this.value1 = value1;
  }

  public U getValue2() {
    return value2;
  }

  public void setValue2(U value2) {
    this.value2 = value2;
  }
}

public class TwoPara {
  public static void main(String[] args) {

    GenericClass<Integer, String> obj1 = new GenericClass<>(10, "Hello");
    GenericClass<Double, Boolean> obj2 = new GenericClass<>(3.14, true);

    int intValue = obj1.getValue1();
    String strValue = obj1.getValue2();
    System.out.println("Values of obj1: " + intValue + ", " + strValue);

    double doubleValue = obj2.getValue1();
    boolean boolValue = obj2.getValue2();
    System.out.println("Values of obj2: " + doubleValue + ", " + boolValue);

    obj1.setValue1(20);
    obj1.setValue2("World");
    obj2.setValue1(2.718);
    obj2.setValue2(false);

    intValue = obj1.getValue1();
    strValue = obj1.getValue2();
    System.out.println("Updated values of obj1: " + intValue + ", " + strValue);

    doubleValue = obj2.getValue1();

    boolValue = obj2.getValue2();
    System.out.println("Updated values of obj2: " + doubleValue + ", " + boolValue);
  }
}
