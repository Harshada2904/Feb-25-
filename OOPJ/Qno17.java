class Qno17{
	public static void main(String args[]){
		int a=5, b=65, c=2, d=31;
		String s =(a<b && a< c && a<d)? a +" is samller": ((b < c && b< d )?b+ " is smaller" : (c<d ? c + " is smaller":d+" is smaller"));
		System.out.println(s);
	}
}