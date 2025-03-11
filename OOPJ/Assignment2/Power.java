public class Power{
	
	public static void power(int n){
		if(n<0) n =-n;
		if((n & (n-1))==0)
			System.out.println(n + " is a power of two");
		else
			System.out.println( n + " is not a power of two");	
	} 
	public static void main(String[] args){
		power(4);
	}
	
}	