//Java program to find Total of the Prime Numbers in an Array of Numbers
public class sumofprimes1
{
public static void main(String[] args)
{
    int tot=0;
int a[]= {2,3,5,7,11,13};//a[0]=2,a[1]=2,a[2]=5,a[3]=7,a[4]=11,a[5]=13
System.out.println(a.length);
for(int i=0;i<a.length;i++)
{
    int counter =0;
    for(int j=1;j<=a[i];j++)
    {
        if(a[i] % j == 0)
        {
            counter+=1;
        }
    }
    if (counter==2)
    {
         tot+=a[i];//tot=tot+a[i]...0+2--tot=2
    }
}
System.out.println("The Total of the Prime Numbers is :"+tot);
}
} 


/*
1st iteration
--------------
when i=0,j=1
2nd iteration
------------
when i=0,j=5
j<=a[0]....j<2

for(i=0;i<a.length;i++)
for(j=1;j<=2;j++)

if(a[0]%j==0)----if(2%1==0)...if(2%2==0)

counter=counter+1=======1+1=2

*/



