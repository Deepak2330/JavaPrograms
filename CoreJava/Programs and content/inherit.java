class A
{
int sno;

A()
{
sno=1;
}

public void disp()
{
System.out.println("Sno:"+sno);
}
}

class B extends A
{
int tot;

B()
{
tot=496;
}
public void disp()
{
System.out.println("Total:"+tot);
}
}

class inherit1
{
public static void main(String str[])
{
B b=new B();
b.disp();
}
}