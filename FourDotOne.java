import java.io.*;

public class FourDotOne {
 
 public static void main(String[] args) {
   doTheThings(); 
 }

 private static String fileToRead = "98-0.txt";
 private static String fileToWrite = "Alpha 98-0.txt";

 private static void doTheThings() {
  try {
   FileReader reader = new FileReader(fileToRead);
   FileWriter writer = new FileWriter(fileToWrite);
   boolean[] okChars = makeOkChars();
   int character;
   while ((character = reader.read()) != -1) {
     System.out.println((char) character);
     System.out.println(character);
     if (!okChars[character]) {
       character = 32;
     }
     writer.write(character);
   }
  } catch (IOException err) {
   System.out.println("something went wrong: " + err.toString());
  }
 }

 private static boolean[] makeOkChars() {
   boolean[] okChars = new boolean[137468];
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
}

