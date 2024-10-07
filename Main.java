public class Main {
  public static void main(String[] args) {
    int[] arr = {65, 45, 34, 12, 99, 54, 39, 2, 88, 18};
    System.out.println("Array before sorting:");
    for (int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    bubbleSort(arr);

    System.out.println("Array after sorting:");
    for (int j=0; j<arr.length; j++) {
      System.out.print(arr[j] + " ");
    }
  }

  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    int temp = 0;
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
