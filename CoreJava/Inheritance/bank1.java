class Bank1
{
int getrate()
{
return 0;
}
}
class SBI extends Bank1
{
int getrate()
{
return 6;
}
}



class ICICI extends Bank1
{
int getrate()
{
return 7;
}
}

class AXIS extends Bank1
{
int getrate()
{
return 8;
}
}

class bank1
{
public static void main(String str[])
{
Bank1 b1=new Bank1();
SBI s=new SBI();
ICICI i=new ICICI();
AXIS a=new AXIS();

System.out.println("SBI Rate of Interest:"+s.getrate());
System.out.println("ICICI Rate of Interest:"+i.getrate());
System.out.println("AXIS Rate of Interest:"+a.getrate());
}
}
