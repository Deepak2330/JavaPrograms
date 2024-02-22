//Program on linear search
import java.util.*;

class linear1
{
public static void main(String str[])
{
Scanner sc=new Scanner(System.in);
int i,k=0,n;
int a[]=new int[10];
for(i=0;i<5;i++)
{
System.out.println("Enter:");
a[i]=sc.nextInt();
}
System.out.println("Enter the search element..");
n=sc.nextInt();
for(i=0;i<5;i++)
{
if(a[i]==n)
k=1;
}
if(k==1)
System.out.println("Element found...");
else
System.out.println("Element Not Found...");
}
}

