import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.SortedSet;

public class collection {

	public static void main(String[] args) {
	// <ArrayList><Integer>l1=new <Integer>;
	 
	 String s1=new String();
	 
	 ArrayList l1=new ArrayList();
	 
	 l1.add(1);
	 
	 ArrayList<String> l2= new ArrayList<String>();
		l2.addAll(l1);
		
		l1.removeAll(l2);
		
		l1.get(1);
		
		for(String ss : l2){
		System.out.println(ss);
		}
		
		for(Object o : l1){
			System.out.println(o);
		}
		
		HashSet ss1=new HashSet(); 	
		
		ss1.add(l1);
				
		HashMap h1= new HashMap();
		
		HashMap<String, Integer> student = new HashMap<String,Integer>();
		
		student.put("Akash", 2);
		student.get("Akash");
		
		for(Map.Entry<String, Integer> m : student.entrySet()){
			
			System.out.println(m.getKey()+""+m.getValue());
			
		}
		
		
		
	}
	
}
