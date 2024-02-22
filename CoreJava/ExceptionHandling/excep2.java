class excep2
{
public static void main(String str[])
{
int a=10,b=0;
int d;

try
{         
d=0;
d=a/b;
}
catch(Exception e)
{
e.printStackTrace();
e.getMessage();
}
//System.out.println("Value of d:"+d);
}
}

//throw new SomeException();