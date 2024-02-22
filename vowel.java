package amcat;

public class vowel {

	public static void main(String[] args)
	{
       String ch="My name is khan I am not a Terrorist";
       String sw=ch.toLowerCase();
     char[] th=sw.toCharArray();
     
     for(int i=0;i<th.length;i++)
     {
    	 
    	 if(th[i]=='a'||th[i]=='e'||th[i]=='i'||th[i]=='o'||th[i]=='u')
    	 {
    		 System.out.println("Vowel found at"+" "+i);
    	 }
    	 
    	 
     }


}
}
