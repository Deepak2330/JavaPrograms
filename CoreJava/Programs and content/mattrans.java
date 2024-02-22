import java.util.*;
class mattrans
{
public static void main(String str[])
{

int i,j;
int a[][]=new int[3][3];
int b[][]=new int[3][3];

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

System.out.println("Transpose of Matrix A..");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[j][i]);
}
System.out.println();
}
}
}

Linear Search
-------------
Sequential search

 a[5]

a[0] a[1] a[2] a[3] a[4]

 6    9   56    23   11






