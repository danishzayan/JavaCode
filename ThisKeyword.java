class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + ".");
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Person person = new Person("John");
        person.sayHello();
    }
}

