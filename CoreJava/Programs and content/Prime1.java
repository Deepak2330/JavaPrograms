import java.io.*;
public class Prime1
{
public static void main(String str[]) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);

int n,i,c=0;
System.out.println("Enter the value of n:");
n=Integer.parseInt(br.readLine());
        
for(i=1;i<=n;i++)    
{  
if(n%i==0)
c=c+1;//c=0+1=1,c=1+1=2
}
if(c==2)
System.out.println("Prime number...");
else
System.out.println("Not a Prime number...");
}
}



     