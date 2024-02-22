/*Program to display the Unit Matrix

1 0 0
0 1 0
0 0 1
*/

import java.util.Scanner;
 
class unit1
{
public static void main(String str[])
{
int i,j,sum=0;
int a[][]=new int[3][3];

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i==j)
a[i][j]=1;

if(i!=j)
a[i][j]=0;
}
}
System.out.println("Display the Unit Matrix..");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}
}
}