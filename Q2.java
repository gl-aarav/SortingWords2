public class Q2 {
  public static void main(String[] args) {
    double[] arr = { 43.2, 13.6, 91.4, 23.6, 72.1 };
    System.out.println("Array before sorting:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    exchangeSort(arr);

    System.out.println("Array after sorting:");
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j] + " ");
      
    }
    System.out.println();
  }

  public static void exchangeSort(double[] arr) {
    int n = arr.length;
    double temp = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
