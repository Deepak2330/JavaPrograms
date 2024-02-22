import java.util.Scanner;
 
class Tracem
{
public static void main(String str[])
{
int i,j,sum=0;
int a[][]=new int[3][3];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements for Matrix A...");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println("Enter:");
a[i][j]=sc.nextInt();
}
}
System.out.println("Display the Matrix A..");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}
System.out.println("Trace of Matrix A..");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
    if(i == j)
     {
            sum = sum + (a[i][j]);
        }
}
}
System.out.println(sum);
}
}