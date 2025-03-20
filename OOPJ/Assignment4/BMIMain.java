
import java.util.Scanner;
class BMICalculator{
	//fields
	private double height;
	private double weight;
	
	// Parameterized constructor
	public BMICalculator(double height,double weight){
		this.height = height;
		this.weight = weight;
	}
	
	 // Getter for height
	public double getHeight(){
		return height;
	}
	
	// Setter for height
	public void setHeight(double height){
		this.height =height;
	}
	
	 // Getter for weight
	public double getWeight(){
		return weight;
	}
	
	// Setter for weight
	public void setWeight(double weight){
		this.weight =weight;
	}
	//method for calculate BMI
	public double calculateBMI(){
		if(height <= 0){
			throw new IllegalArgumentException("Height must be greater than zero.");
		}
		return weight / (height * height);
	
	}
}

public class BMIMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your height in meters: ");
		float height = sc.nextFloat();
		
		System.out.println("Enter your weightin kilograms: ");
		float weight = sc.nextFloat();
			BMICalculator bc = new BMICalculator(height,weight);
			//bc.setHeight(height);
			//bc.setWeight(weight);
			
		double bmi = bc.calculateBMI();
		
		System.out.printf("Your BMI is: %.2f\n",bmi);
	
	}
}