import java.util.*;

public class TwoDotThree {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("enter array size: ");
     int arrSize = scanner.nextInt(); 
     System.out.print("enter numbers to sort: ");
     scanner.nextLine();
     String[] strings = scanner.nextLine().split(" "); 
     int[] numberArr = new int[arrSize];
     for (int i = 0 ; i < arrSize ; i++) {
       numberArr[i] = Integer.parseInt(strings[i]); 
     }
     TwoDotThree.sort(numberArr);
     for (int i = 0 ; i < arrSize ; i++) {
       System.out.print(numberArr[i] + " ");
     }
     System.out.println();
  }

  private static void sort(int[] arr) {
    int count = 0;
    for (int i = 1 ; i < arr.length ; i++) {
      for (int j = i ; j > 0 && arr[j] > arr[j-1] ; j--) {
        int swapIndex = j - 1;
        swap(arr, j, swapIndex);
        count++;
        System.out.println("Swapping elements " + swapIndex + " and " + j + " (values " + arr[j] + " and " + arr[swapIndex] + ")."); 
      }
    }
    System.out.println(count + " swap(s) made!");
  }
  
  private static void swap(int[] arr, int i, int j) {
    int item = arr[i];
    arr[i] = arr[j];
    arr[j] = item;
  }
}
