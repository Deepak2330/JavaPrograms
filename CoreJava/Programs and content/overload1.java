//Program to calculate the area of square,rectangle,triangle and circle(use method overloading)

class area1
{
void area(int x)
{
System.out.println("Area of a Square: "+Math.pow(x,2)+"sq units");
}
void area(int x,int y)
{
System.out.println("Area of a rectangle: "+x*y+"sq units");
}

void area(double h,double b)
{
System.out.println("Area of a triangle:"+ (0.5)*b*h +"sq.units");
}

void area(double r)
{
System.out.println("Area of circle:"+(3.14)*r*r +"sq units"); 
}
}
class overload1
{
public static void main(String str[])
{
area1 a1=new area1();
//square
a1.area(6);
//rectangle
a1.area(4,5);
//triangle
a1.area(7.0,8.0);
//circle
a1.area(2.0);
}
}
