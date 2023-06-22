import java.util.Scanner;

public class EmpInfo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Employee Name: ");
    String name = scanner.nextLine();

    System.out.print("Enter Employee Age: ");
    int age = scanner.nextInt();
    scanner.nextLine(); // Consume the remaining newline character

    System.out.print("Enter Employee Blood Group: ");
    String bloodGroup = scanner.nextLine();

    System.out.print("Enter Employee Height: ");
    double height = scanner.nextDouble();

    // Display the Employee Information
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Age: " + age);
    System.out.println("Employee Blood Group: " + bloodGroup);
    System.out.println("Employee Height: " + height);

    scanner.close();
  }
}
