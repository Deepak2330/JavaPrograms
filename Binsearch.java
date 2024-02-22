
public class Binsearch {
	public static void  fun(int[] arr,int first,int last,int key){
		int mid=(first+last)/2;
		
				while(first<=last)
		 { 
			 if(arr[mid]<key)
			 {
				 first=mid+1;
				 
			 }
			 else if(arr[mid]>key)
			 {
				 last=mid-1;
				
			 }
			 else if(arr[mid]==key)
			 {
				 System.out.println("found at"+ mid);
				 break;
			 }
			
			 else {	  
				 System.out.println("not found");
			 }
			 mid=(first+last)/2;
			 }
		
	}
      public static void main(String[] args) {
	  int[] arr={1,23,34,45,67};
  int first=arr[0];
	  int last=arr.length-1;
	  int key=67;
	  fun(arr,first,last,key);
	}
}
