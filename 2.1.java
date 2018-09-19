public class 21 {
  public static void main(String[] args) {
     System.out.print("enter array size: ");
     int arrSize = StdIn.readInt(); 
     System.out.print("enter numbers to sort: ");
     int numbers = StdIn.readInt();
     int[] numberArr = new int[arrSize];
     for (int i = 0 ; i < arrSize ; i++) {
       numberArr[i] = numbers / (10^(arrSize - i - 1));
     }
     21.sort(numberArr);
     System.out.println(numberArr); 
  }

  private static void sort(int[] arr) {
    for (int i = 1 ; i < arr.length ; i++) {
      for (int j = i ; j > 0 && arr[j] < arr[j-1] ; j--) {
        swap(a, j, j - 1);
        System.out.println("Swapping elements " + j-1 + " and " + j + " (values " + a[j] + " and " + a[j-1] + ")."; 
      }
    }
  }
  
  private static void swap(int[] arr, int i, int j) {
    int item = arr[i];
    arr[i] = arr[j];
    arr[j] = item;
  }
}
