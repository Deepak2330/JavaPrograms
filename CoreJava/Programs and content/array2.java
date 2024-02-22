//program on double-dimensional array

import java.util.Scanner;
class array2
{
public static void main(String str[])
{
int i,j;
int a[][]=new int[3][3];
Scanner sc=new Scanner(System.in);

System.out.println("\n\t Enter the elements...");

for(i=0;i<3;i++) //accepting the values
{
for(j=0;j<3;j++)
{
System.out.print("\n\t Enter the values a["+i+"]["+j+"]...");

a[i][j]=sc.nextInt();
}
}

System.out.println("\n\t Display the matrix...");

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]);
}
System.out.println("\n");
}
}
}


