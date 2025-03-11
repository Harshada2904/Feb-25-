class Logical{
	public static void main(String args[]){
		int x = 5, y = 4, z = 8;
		
		//&& Logical and operator
		System.out.println((x > y) && (z > x));
		
		//|| Logical or operator
		System.out.println((y < x )||( x < z ));
		
		// ! Logical not operator
		System.out.println(!(x == y));
	}


}