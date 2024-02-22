/*Program using selection sort 
a[0]    a[1]     a[2]    a[3]      a[4]     a[5]    a[6]     a[7]
44      97        49      56        89       27      15       77

*/


//Program on selection sort
import java.util.*;

class Selectsort
{
public static void main(String str[])
{
Scanner sc=new Scanner(System.in);
int i,j,t,min=0;
int a[]=new int[10];
for(i=0;i<5;i++)
{
System.out.println("Enter:");
a[i]=sc.nextInt();
}
for(j=0;j<5;j++)
{
if(a[j]>a[j+1])
{
min=j;
}
t=a[i];
a[i]=a[min];
a[min]=t;
}
System.out.println("The numbers are arranged in ascending order...");
for(i=0;i<5;i++)
System.out.println(a[i]);
}
}


