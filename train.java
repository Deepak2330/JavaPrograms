package softsovaa;

public class train {
	
	public static void bus(int sp1,int ep1,int sp2,int ep2,int no)
	{
		boolean check=true;
		if((sp2<ep1)&&(ep1<ep2))//2<3&&3<4
		{
			check=false;
		}
		else{
			check=true;
		}
	if(check==false)
	{
		no=no-1;
	}
	System.out.println(no);
	}
public static void main(String[] args) {
 bus(1,3,2,4,2);
 System.out.println("SSSSSSSSSSSSIIIIIIIIIIIISSSSSSSSSSS");
 bus(1,3,4,6,2);
 System.out.println("SSSSSSSSSSSSIIIIIIIIIIIISSSSSSSSSSS");
 
 
}
}
