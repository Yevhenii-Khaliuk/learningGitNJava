import java.util.Random;

public class Heapsort {
  public static void sort(int[] a) {
    for (int i = a.length / 2 - 1; i >= 0; i--) {
      shiftDown(a, i, a.length);      
    }
    for (int i = a.length - 1; i > 0; i--) {
      swap(a, 0, i);
      shiftDown(a, 0, i);
    }
  }

  private static void shiftDown(int[] a, int i, int n) {
    int child;
    int tmp;

    for (tmp = a[i]; leftChild(i) < n; i = child) {
      child = leftChild(i);
      if (child != n - 1 && (a[child] < a[child + 1])) {
        child++;
      }
      if (tmp < a[child]) {
        a[i] = a[child];
      } else {
        break;
      }
    }
    a[i] = tmp;
  }

  private static int leftChild(int i) {
    return i * 2 + 1;
  }

  private static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static void main(String[] args) {
    Random rand = new Random();
    int[] array = new int[50];
    System.out.println("Starting array:");
    for (int i = 0; i < 50; i++) {
      array[i] = rand.nextInt(100);
      System.out.format("%3d", array[i]);
    }
    sort(array);
    System.out.println();
    System.out.println("Sorted array:");
    for (int i = 0; i < 50; i++) {
      System.out.format("%3d", array[i]);
    }
  }
}