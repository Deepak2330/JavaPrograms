//Progam on Aggregation
public class Emp
 {  
int id;  
String name;  
Address ad; //Entity 
  
public Emp(int id, String name,Address address) //parameterized constructor
{  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display()
{  
System.out.println("Employee Details...");
System.out.println("\n\t ID:"+id);
System.out.println("\n\t Name:name);
System.out.println("\n\t City:"+address.city);
System.out.println("\n\t State:"+address.state);
System.out.println("\n\t Country:"+address.country);

/*System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  */
}  
  
public static void main(String[] args) 
{  
Address address1=new Address("gzb","UP","india");  
Address address2=new Address("gno","UP","india");  
  
Emp e1=new Emp(111,"RAM",address1);  
Emp e2=new Emp(112,"SHYAM",address2);  
      
e1.display();  
e2.display();  
      
}  
}  