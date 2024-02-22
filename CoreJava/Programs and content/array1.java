//Program on double dimensional arrays
import java.util.Scanner;

class array1
{
public static void main(String str[])
{
int i,j;//accessing the array

int a[][]=new int[3][3];

Scanner sc=new Scanner(System.in);

System.out.println("Enter the values...");

for(i=0;i<3;i++)
{
for(j=0;j<3;j++) 
{
System.out.print("Enter:");
a[i][j]=sc.nextInt(); 
}
}

System.out.println("Display the values...");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(" "+a[i][j]);
}
System.out.println();
}
}
}
