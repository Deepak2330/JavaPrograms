
import java.io.*;

class aritexcep
{
public static void main(String str[]) throws Exception
{

int a=0,b=0;
int c=a+b;

InputStreamReader isr=new InputStreamReader(System.in);

BufferedReader br=new BufferedReader(isr);


System.out.println("Enter the value of a:");
a=Integer.parseInt(br.readLine());


System.out.println("Enter the value of b:");
b=Integer.parseInt(br.readLine());

c=a+b;

System.out.println("\n\t Value of C:"+c);


}
}


getMessage()
printStatckTrace();