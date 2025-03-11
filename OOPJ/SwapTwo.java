class SwapTwo{
	public static void main(String args[]){
	
	int a = 5;
	int b = 3;
	System.out.println("Before the swap " + a + " and" + b);
	
	a = a +b;
	b = a-b;
	a = a-b;
	
	System.out.println("After the swap "+a + " and" +b);
	
	}

}