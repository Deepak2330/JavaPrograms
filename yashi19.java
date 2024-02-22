package repeat;

public class yashi19 {
	public int orderId;
	public String orderedFood;
	public double totalPrice;
	public String status;
	

	public void displayDetails () {
		System.out.println("Order Id :" +orderId);
		System.out.println("Ordered Food :" +orderedFood);
		System.out.println("Ordered Status :" +status);
	}
	
    public double calculateTotalPrice(int unitPrice) {
		
		System.out.println("order Details");
		totalPrice = Math.round(unitPrice* (1+(5/100.0)));
		
		return totalPrice;
		
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		yashi19 order1 = new yashi19 ();
		
		order1.orderId = 101;
		order1.orderedFood = "Spinach Alfredo Pasta";
		order1.status = "ordered";
		
		double y = order1.calculateTotalPrice(33);
		
		order1.displayDetails();
		System.out.println("Total Price :" +y);
		

}
}
