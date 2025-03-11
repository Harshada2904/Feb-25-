public class Divisible {
	public static void main(String[] args){
		int n = 6;
		if(n<0){
			n = -n;
		}
		
		while(n>3){
			n = (n & 3) + (n >> 2);
		}
		
		if(n==0 || n==3)
			System.out.println(" Number is Divisible by 3");
		else
			System.out.println("Number is not divisible by 3");
	
	}
}