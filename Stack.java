import java.util.*;

public class Stack<U> {
  private U[] arr;
  private static int index = 0;

  public Stack(int size) {
    arr = (U[]) new Object[size]; 
  }

  public static void main(String[] args) {
    reverse();
 } 

  private static void reverse() {
  System.out.println("Enter word: ");
  Scanner scanner = new Scanner(System.in);
  Stack stack = new Stack(200);
  String phrase = scanner.next();
  String[] chars = phrase.split("");
  for (int i = 0 ; i < chars.length ; i++) {
    stack.push(chars[i]);
  }
  while (!stack.isEmpty()) {
    System.out.print(stack.pop());
  }
  }
 
  public void push(U item) {
   arr[index++] = item; 
  }

  public U pop() {
    U item = arr[--index];
    arr[index] = null; 
    return item;
  }

  public boolean isEmpty() {
    return index == 0;
  }

  public int getSize() {
    return index;
  }
}


