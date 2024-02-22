public class Emp
 {
    int Emp_id;
    String Emp_Name;
    Address address;
    
    public Emp(int Emp_id, String Emp_Name, Address address)
     {
        
            this.Emp_id = Emp_id;
            this.Emp_Name = Emp_Name;
            this.address = address;
        }
        
    public void display() 
     {
        System.out.println("\t\nEmployee_Id = " + Emp_id);
        System.out.println("\t\nEmployee_Name = " + Emp_Name);
        System.out.println("\t\nAddress = " + address.city +" "+ address.state +" " + address.country);    
        }
    public static void main(String []args) 
{
        Address ad1 = new Address("Hamirpur","H.P","India");
        Emp ep1 = new Emp(101, "Rahul" , ad1);
        ep1.display();
}
}