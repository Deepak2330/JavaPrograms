//program on constructors
 class stud
{
int sno; //data member

public stud() //non-parameterized constructor
{
sno=1;
}

public stud(int s) //parameterized constructors
{               
sno=s;
}

public void disp()//member-function
{
System.out.println("Sno:"+sno);
}
}
public class stud1
{
public static void main(String str[])
{
stud s=new stud();//non-parameterized
s.disp();
stud s1=new stud(10);//parameterized
s1.disp();
stud s3=new stud(100);//parameterized
s3.disp();

}
}






