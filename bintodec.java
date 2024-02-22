package SoftSuave;

public class bintodec {
public static void main(String[] args) {
int bin=1010;
int dec=0;
int r;
int n=0;
while(bin>0)
{  r=bin%10;
   dec=(int) (dec+r*Math.pow(2,n));
   bin=bin/10;
   n++; 
	}
		System.out.println(dec);
	/////////////////////////DEctobin
		String BINARY="";
		int R;
		
		while(dec>0)
		{ dec=dec/2;
			R=dec%2;
			BINARY=BINARY+R;
				
		}
		System.out.println(BINARY);
		
		
}
}
