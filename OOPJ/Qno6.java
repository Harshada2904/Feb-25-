class Qno6{
	public static void main(String args[]){
		int a = 10, b=6, c=40;
		String s =(a>b && a>c)? (a + " is greatest number "): (b>a && b>c)? (b + " is greatest number"):(c + " is greatest number");
		System.out.println(s);
	}
}