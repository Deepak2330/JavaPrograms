import java.util.Scanner;
public class sum1
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
}