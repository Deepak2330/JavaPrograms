//Program on Inheritance
 class A //A--Super class
{
int sno;
A() //constructor
{
sno=1;
}
public void disp()
{
System.out.println("Student No:"+sno);
}
}
class B extends A //B-child class 
{
String sname=" ";
B()
{
sname="ABC";
}
public void disp()
{
super.disp();
System.out.println("Student Name:"+sname);

}
}

class stud1
{
public static void main(String str[])
{
B b=new B(); //sub class
b.disp();
}
}

