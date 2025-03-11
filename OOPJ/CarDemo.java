class Car{
	double gas = 0;
	double running = 0;
	double efficiency = 0;
	public void drive(double x){
		running += x;
		gas = gas - (running/efficiency);
	}
	
	public void loadgas(double gas){
		this.gas += gas;
	}
	
	public void changeEfficiency(double eff){
		efficiency = eff;
	}
	
	public void checkGas(){
		System.out.printf("%.2fL",gas);		
	}
	
	public void checkOdometer(){
		System.out.println("\nTotal: " + running);		
	}
}

public class CarDemo{
	public static void main(String[] args){
			Car c = new Car();
				c.changeEfficiency(13);
				c.gas=20.0;
				c.drive(20);
				c.checkGas();
				c.checkOdometer();
				
	}
}				
			