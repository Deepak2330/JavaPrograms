

// Display the sum of ‘n’ number of elements using for loop....
import java.util.Scanner;
public class SumOfNumber
{
public static void main(String str[])
{
Scanner scn = new Scanner (System.in);
int StoreNum = 0;
int sum = 0;
System.out.print("Please enter a number, which is grater than ZERO :: ");
StoreNum = scn.nextInt(); // Store input value
for (int num = 1; num <= StoreNum; num++)
{                          
sum = sum + num;//sum=0+1=1,sum=1+2=3,sum=3+3=6
}
System.out.print("\n\t Sum of n elements :"+sum);
}
}

/*import java.util.Scanner;
public class TestClass2
{
public static void main(String[] args)
{
int n,tot=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number :");
n = sc.nextInt();
for(int i=0;i<=n;++i)
{
    tot=tot+i;
}
System.out.println("The Total is :"+tot);
}
}*/