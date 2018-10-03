import java.util.*;

public class FourDotOne {
 
 public static void main(String[] args) {
   doTheThings(); 
 }

 private static void doTheThings() {
   String[] input = readArr();
   boolean[] okChars = makeOkChars();
   for (int i = 0 ; i < input.length ; i++) {
     if (!okChars[(int) input[i].charAt(0)]) {
       input[i] = " ";
     }
   }
   printArr(input); 
 }

 private static boolean[] makeOkChars() {
   boolean[] okChars = new boolean[128];
   okChars[10] = true;
   okChars[32] = true;
   for (int i = (int) 'A' ; i <= (int) 'Z' ; i++) {
    okChars[(int) i] = true;
   } 
   for (int i = 'a' ; i <= 'z' ; i++) {
    okChars[(int) i] = true;
   }
   return okChars;
 }

 private static String[] readArr() {
   Scanner scanner = new Scanner(System.in);
   System.out.print("enter array size: ");
   int arrSize = scanner.nextInt(); 
   System.out.print("enter string to filter: ");
   scanner.nextLine();
   return scanner.nextLine().split(""); 
 }

 private static void printArr(String[] arr) {
  for (int i = 0 ; i < arr.length ; i++) {
    System.out.print(arr[i]);
  }
  System.out.println("");
 }
}
