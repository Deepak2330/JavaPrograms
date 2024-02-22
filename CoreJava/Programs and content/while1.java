
class while1
{
public static void main(String str[])
{
int n=632,d,rev=0;

while(n>0)
{
d=n%10;
rev=rev*10+d;
n/=10;

System.out.println("\n\t Reverse Number:"+rev);
}
}
}
