/*Using Command-Line Arguments
-----------------------------
Sometimes you will want to pass some information into a program when you run it. This is accomplished by passing command-line arguments to main( ).

A command-line argument is the information that directly follows the program's name on the command line when it is executed. To access the command-line arguments inside a Java program is quite easy. They are stored as strings in the String array passed to main( ).

Example
-------

//The following program displays all of the command-line arguments that it is called with 

public class CommandLine2 
{

   public static void main(String args[]) 
{ 
      for(int i = 0; i<args.length; i++) //length
{
         System.out.println("args[" + i + "]: " +  args[i]);
      }
   }
}