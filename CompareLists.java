package amcat;

import java.awt.List;
import java.util.ArrayList;

public class CompareLists {
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
		List<Integer> result= new ArrayList<>();
		int ap=0;
		int bp=0;
		
		for (int i=0;i<a.size();i++){
			if(a.get(i)>b.get(i)){
				ap=ap+1;
			}
			else if(a.get(i)<b.get(i)){
				bp=bp+1;
				
			}
		}
		
		result.add(ap);
		result.add(bp);
		return result;
		}


}
