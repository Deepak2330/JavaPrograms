package SoftSuave;

public class word {
	public static void main(String[] args) {

		//char [][] arr = new char[3][3];
		char[][] arr = {{'X','O','T'},{'A','O','W'},{'P','S','B'}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("??????????????????????????????");
		String tar="TOP";	
		//String totar="";
		for(int k=0;k<3;k++)
		{String totar="";
		for(int l=0;l<3;l++)
		{
			System.out.println("JUST=="+arr[k][l]+" ");//ref
			totar=totar+arr[k][l];
		}
		if(tar.equals(totar))
		{
			System.out.println("Found"+totar);		
		}
		else {
			System.out.println(totar);// ref
		}
		}
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		for(int r=0;r<3;r++)
		{String totar="";
		for(int s=2;s>=0;s--)
		{
			System.out.println("JUST=="+arr[r][s]+" ");//ref
			totar=totar+arr[r][s];
		}
		if(tar.equals(totar))
		{
			System.out.println("Found"+totar);		
		}
		else {
			System.out.println(totar);// ref
		}
		}
		System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");

		for(int k=0;k<3;k++)
		{String totar="";
		for(int l=0;l<3;l++)
		{ if((k==l))
		{
			// System.out.print(arr[k][l]+" ");//ref
			totar=totar+arr[k][l];
		}
		}
		if(tar.equals(totar))
		{
			System.out.println("Found"+totar);		
		}
		else {
			System.out.print(totar);// ref
		}
		}
		System.out.println();
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		for(int k=0;k<3;k++)
		{String totar="";
		for(int l=0;l<3;l++)
		{ if((k+l)==2)
		{
			//System.out.println("JUST=="+arr[k][l]+" ");//ref
			totar=totar+arr[k][l];
			//System.out.println("Res;"+totar);
		}
		}

		if(tar.equalsIgnoreCase(totar))
		{
			System.out.print("Found"+totar);		
		}
		else {
			System.out.print(totar);// ref
		}
		}
	}
}
