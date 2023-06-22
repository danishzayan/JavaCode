public class MatrixMultiplication {
  public static void main(String[] args) {
    int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
    int[][] matrix2 = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

    int rows1 = matrix1.length;
    int columns1 = matrix1[0].length;
    int rows2 = matrix2.length;
    int columns2 = matrix2[0].length;

    if (columns1 != rows2) {
      System.out.println("Matrix multiplication is not possible.");
      return;
    }

    int[][] productMatrix = new int[rows1][columns2];

    // Matrix Multiplication
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < columns2; j++) {
        for (int k = 0; k < columns1; k++) {
          productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
        }
      }
    }

    // Display the Product Matrix
    System.out.println("Product Matrix:");
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < columns2; j++) {
        System.out.print(productMatrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
