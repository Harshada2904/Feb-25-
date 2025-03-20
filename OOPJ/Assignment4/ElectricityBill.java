import java.util.Scanner; 
class ElectricityBill{
	private String customerName;
	private double unitsConsumed;
	private double billAmount;

	ElectricityBill(String customerName, double unitsConsumed){
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
		this.billAmount = 0;
	}
	
	void calculateBillAmount(){
		double units = unitsConsumed;
		if(units <= 100){
			billAmount = units * 5;
		}else if( units <= 300){
			billAmount =(100 * 5) + ((units -100) * 7);
		}else {
			billAmount = (100 * 5)+(200 * 7)+((units -300)* 10);
		}
	
	}
	public void display(){
		
        System.out.println("----- Electricity Bill -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Final total Bill Amount: Rs. " + billAmount);
    
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter units consumed value:");
		double units = sc.nextDouble();
		
		ElectricityBill bill = new ElectricityBill(name , units);
		bill.calculateBillAmount();
		bill.display();
		
		
		
	}

}