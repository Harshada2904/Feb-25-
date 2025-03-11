
import java.io.*;
class SumDigit{
	public static void main(String args[]){
	
	int a = 1234;
	
	int sum = 0;
	
	while(a != 0){
		int dig = a % 10;
		 sum +=dig;
	
		a /= 10;
		
		}
		
		System.out.println("Sum of digits " +sum);
	}

}