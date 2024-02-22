import java.io.*;
 
class Div1
{
  public static void main(String[] args) 
  throws IOException
{
 
  int result;
       
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
 System.out.println("Input two integers");
 
 int a = br.read();
  int b = br.read();
 
  result = a + b;
       
  System.out.println("Result = " + result);
  }
}


