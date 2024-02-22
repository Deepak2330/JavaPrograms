class staticex1
{
int a;
int c;

staticex1()
{
//constructor to initialize a and b
a=0;
c=0;
}

void getcount()
{
c=++a;
System.out.println("\n\t Counter value:"+c);
}
}

public class staticex
{
public static void main(String str[])
{
staticex1 s1=new staticex1();
staticex1 s2=new staticex1();

s1.getcount();
s2.getcount();
}
}