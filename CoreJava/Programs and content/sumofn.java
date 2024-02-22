//program to add n numbers.
import java.util.scanner;
class sumofn
{
public static void main(String str[])
{
  int i=0;
  int sum=0;
  Scanner scan=new Scanner(System.in);
System.out.println("Enter the value of n:");
  int n=scan.nextInt();
  for(i=0;i<=n;i++)
  {
     sum=sum+i;
  }
  System.out.println("Sum of n numbers is :"+sum);
}
}
  