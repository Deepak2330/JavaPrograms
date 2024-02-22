package amcat;

public class nitishtry {
	public static void main(String[] args) {
int[] arr={10,50,60,20,5};
int n=arr.length;
int tenp;
for(int i=0;i<n;i++)
{
	for(int j=1;j<(n-i);j++)
		
	{
		if(arr[j-1]>arr[j])
		{ 
			tenp=arr[j-1];
			arr[j-1]=arr[j];
			arr[j]=tenp;
			
		}
		
	}
}
for(int i=0;i<n;i++)
{
	System.out.print(arr[i]+" ");
}

}
}
