package repeat;

public class perfectsqrrnot {
	public static void main(String[] args) {
		int n=28;
		int sq;
			for(int i=1;i<=n/2;i++)
			{sq=i*i;
				if (n==sq){
					System.out.println("Square");
					break;
				}
				else {
					System.out.println("no");
					break;
				}
			}
		
	}

}
