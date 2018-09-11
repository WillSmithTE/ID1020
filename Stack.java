import java.util.*;

public class Stack<U> {
 private U[] arr;
  private int index = 0;
  public Stack(int size) {
    arr = (U[]) new Object[size]; 
  }

  public static void main(String[] args) {
  System.out.println("Enter word: ");
  Scanner scanner = new Scanner(System.in);
  Stack stack = new Stack(200);
  int c = 0;
  while (c != 13) {
   c = scanner.nextInt();
   stack.push(c);
   System.out.println(c);
  } 
  while (!stack.isEmpty()) {
    System.out.println(stack.pop());
  }
  } 

  public void push(U item) {
   arr[index++] = item; 
  }

  public U pop() {
    U item = arr[index];
    arr[index--] = null; 
    return item;
  }

  public boolean isEmpty() {
    return index == 0;
  }

  public int getSize() {
    return index;
  }
}


