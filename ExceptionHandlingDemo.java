// public class ExceptionHandlingDemo {
//   public static void main(String[] args) {

//     try {
//       // Code that may throw an exception
//       int result = divide(10, 0);
//       System.out.println("Result: " + result);
//     } catch (ArithmeticException ex) {
//       // Catch the specific exception type
//       System.out.println("Error: " + ex.getMessage());
//     } finally {
//       // Code that will always execute, regardless of whether an exception occurred or
//       // not
//       System.out.println("Finally block executed");
//     }
//   }

//   public static int divide(int num1, int num2) {
//     return num1 / num2;
//   }
// }

import java.io.*;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {
    try {
      // Code that may throw an exception
      readFile("nonexistent.txt");
    } catch (FileNotFoundException ex) {
      // Catch the specific exception type
      System.out.println("Error: " + ex.getMessage());
    }
  }

  public static void readFile(String fileName) throws FileNotFoundException {
    if (!fileExists(fileName)) {
      throw new FileNotFoundException("File not found: " + fileName);
    }
    // Code to read the file goes here
    System.out.println("Reading file: " + fileName);
  }

  public static boolean fileExists(String fileName) {
    // Simulating file existence check
    return false;
  }
}