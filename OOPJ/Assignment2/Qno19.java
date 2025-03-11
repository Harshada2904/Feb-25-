class Qno19{
	public static void main(String args[]){
		char ch = 'f';
		String s =(ch >='A' && ch <='Z')? (" Letter is uppercase"):(ch >= 'a' && ch <= 'z')? ("Letter is lowercase"):("Not a leeter");
		System.out.println(s);
	}
}