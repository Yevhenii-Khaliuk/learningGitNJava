import java.util.Random;

public class Quicksort {
  public static void sort(int[] a) {
    sort(a, 0, a.length - 1);
  }

  private static void sort(int[] a, int lo, int hi) {
    if (hi <= lo) {
      return;
    }
    int j = partition(a, lo, hi);
    sort(a, lo, j - 1);
    sort(a, j + 1, hi);
  }

  private static int partition(int[] a, int lo, int hi) {
    int i = lo;
    int j = hi + 1;
    int v = a[lo];
    while (true) {
      while (a[++i] < v) {
        if (i == hi) {
          break;
        }
      }
      while (v < a[--j]) {
        if (j == lo) {
          break;
        }
      }
      if (i >= j) {
        break;
      }
      swap(a, i, j);
    }
    swap(a, lo, j);
    return j;
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