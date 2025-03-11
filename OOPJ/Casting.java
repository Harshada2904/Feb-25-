public class Casting{
	public static void main(String[] args){
		
		char ch = 'C'; 
		int i = ch;    
		System.out.println(i);
		float f = i;   
		int num = 7520; 
		double d = num; 
		System.out.println(f + " " + d);
		
		
		
		double db = 9999.99;
		int number = (int)db;
		System.out.println(db ); 
		System.out.println(number ); 
	}
}