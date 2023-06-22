import java.util.Arrays;

public class AscDsc {
  public static void main(String[] args) {

    int[] numbers = { 10, 5, 8, 3, 1 };

    // Ascending Order Sorting
    Arrays.sort(numbers);
    System.out.println("Ascending Order:");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();

    // Descending Order Sorting
    for (int i = 0; i < numbers.length / 2; i++) {
      int temp = numbers[i];
      numbers[i] = numbers[numbers.length - 1 - i];
      numbers[numbers.length - 1 - i] = temp;
    }
    System.out.println("Descending Order:");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
