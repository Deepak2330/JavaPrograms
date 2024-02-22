import java.io.*;
import java.util.*;

public class HelloWorld {
   public static void main(String[] args) {
      String input = "helloworld";
      char[] s = input.toCharArray();
      for (int i = s.length-1;i >= 0; i--) 
System.out.print(s[i]);
   }
}