import java.util.Arrays;
import java.util.Random;

public class Matrices {
  public static void main(String[] args) {
    Random rand = new Random();

    System.out.println("Exercise 1.");

    int[][] array1 = new int[5][6]; 
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        array1[i][j] = rand.nextInt(100);
      }
    }

    System.out.println("Starting matrix:");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        System.out.format("%3d", array1[i][j]);
      }
      System.out.println();
    }
    System.out.print("Third line: ");
    for (int i = 0; i < 6; i++) {
      System.out.print(array1[2][i] + " ");
    }

    System.out.println();
    System.out.println("Exercise 2.");

    int[][] array2 = new int[3][3];
    int[][] array3 = new int[3][3];
    int[][] addResult = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        array2[i][j] = rand.nextInt(100);
        array3[i][j] = rand.nextInt(100);
        addResult[i][j] = array2[i][j] + array3[i][j];
      }
    }

    int[][] multiplyResult = new int [3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        multiplyResult[i][j] = 0;
        for (int k = 0; k < 3; k++) {
          multiplyResult[i][j] += array2[i][k] * array3[k][j];
        }
      }
    }

    System.out.println("First matrix:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.format("%3d", array2[i][j]);
      }
      System.out.println();
    }
    System.out.println("Second matrix:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.format("%3d", array3[i][j]);
      }
      System.out.println();
    }
    System.out.println("Multiplication result:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.format("%6d", multiplyResult[i][j]);
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("Exercise 3.");

    int matrixElementsSum = 0;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        matrixElementsSum += array1[i][j];
      }
    }
    System.out.println("Sum of all starting matrix elements: " + matrixElementsSum);
    System.out.println();
    System.out.println("Exercise 4.");

    int[][] array4 = new int[5][6]; 
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        array4[i][j] = rand.nextInt(100) - 50;
      }
    }

    System.out.println("Fourth matrix:");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        System.out.format("%4d", array4[i][j]);
      }
      System.out.println();
    }
    System.out.print("Negative elements indices: ");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        if (array4[i][j] < 0) {
          System.out.print("(" + i + "," + j+ ") ");
        }
      }      
    }

    System.out.println();
    System.out.println("Exercise 5.");

    for (int i = 0; i < 5; i++) {
      Arrays.sort(array1[i]);
    }

    System.out.println("Sorted starting matrix:");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        System.out.format("%3d", array1[i][j]);
      }
      System.out.println();
    }
  }
}