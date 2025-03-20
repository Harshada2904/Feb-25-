import java.util.InputMismatchException;
import java.util.Scanner; 
class ElectricityBillException{
	private String customerName;
	private double unitsConsumed;
	private double billAmount;

	ElectricityBillException(String customerName, double unitsConsumed){
		if(unitsConsumed <0){
			throw new IllegalArgumentException("Units Consumed is negative");
		}
		
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
		this.billAmount = 0.0;
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
		//String name = "";
       //double units = 0.0;
		
		
		try{
		System.out.println("Enter customer name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter units consumed value:");
		double units = sc.nextDouble();
		
		ElectricityBillException bill = new ElectricityBillException(name , units);
		bill.calculateBillAmount();
		bill.display();
		}catch(InputMismatchException e){
			System.out.println("input is number only");
		
		}catch(IllegalArgumentException e){
			System.out.println("Error " + e.getMessage());
		
		}finally{
			System.out.println(" Execution completed");
		
		}
		
	}

}