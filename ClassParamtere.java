class GenericClass<T> {
  private T value;

  public GenericClass(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}


public class ClassParamtere {
  public static void main(String[] args) {


    GenericClass<Integer> intObj = new GenericClass<>(10);
    GenericClass<String> strObj = new GenericClass<>("Hello, World!");

    int intValue = intObj.getValue();
    System.out.println("Integer value: " + intValue);

    String strValue = strObj.getValue();
    System.out.println("String value: " + strValue);

    intObj.setValue(20);
    strObj.setValue("Hello, OpenAI!");

    int updatedIntValue = intObj.getValue();
    System.out.println("Updated integer value: " + updatedIntValue);

    String updatedStrValue = strObj.getValue();
    System.out.println("Updated string value: " + updatedStrValue);
  }
}
