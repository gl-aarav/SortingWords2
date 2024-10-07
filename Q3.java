import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    char[] arr = { 'a', 'g', 'k', 'j', 't', 'i', 'f', 's', 'w', 'b' };
    System.out.println("Array before sorting:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    BubbleSort(arr);

    System.out.println("Array after sorting:");
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j] + " ");
    }
    System.out.println();
  }

  public static void BubbleSort(char[] arr) {
    int n = arr.length;
    char temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (arr[j - 1] > arr[j]) {
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}