//Parsing date to String

import java.util.*;
import java.text.*;
  
public class DateDemo5 
{

   public static void main(String args[]) 
   {
      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
      String input = args.length == 0 ? "2019-08-13" : args[0]; 

      System.out.print(input + " Parses as "); 
      Date t;
      try 
     {
         t = ft.parse(input); 
         System.out.println(t); 
      } catch (ParseException e) 
       { 
         System.out.println("Unparseable using " + ft); 
      }
   }
}