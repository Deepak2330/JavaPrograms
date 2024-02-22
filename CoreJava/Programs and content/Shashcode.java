// Java program to demonstrate working of 
// hasCode() and toString() 
public class Shashcode 
{ 
    static int last_roll = 100;  
    int roll_no; 
  
    // Constructor 
    Shashcode() 
    { 
        roll_no = last_roll; 
        last_roll++; 
    } 
  
    // Overriding hashCode() 
    @Override
    public int hashCode() 
    { 
        return roll_no; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        Shashcode s = new Shashcode(); 
  
        // Below two statements are equivalent 
        System.out.println(s); 
        System.out.println(s.toString()); 
    } 
} 

//Note that 4*16^0 + 6*16^1 = 100