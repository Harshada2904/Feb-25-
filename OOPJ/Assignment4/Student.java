class Student{
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	private int total;
	private double average;


	public void assignValue(String name, int sub1, int sub2,int sub3){
			this.name = name;
			this.sub1 = sub1;
			this.sub2 = sub2;
			this.sub3 = sub3;
			
	}
	public void totalAverage(){
		total = sub1 + sub2 + sub3;
		average =total/3.0;
	}
	public void display(){
		System.out.println("Student name: "+name);
		System.out.println("Total marks of Student : "+total);
		System.out.println("Average of 3 subjects marks: "+average);
	}
	
	
	
	public static void main(String args[]){
		Student s = new Student();
		s.assignValue("Aditya",40,55,43);
		s.totalAverage();
		s.display();
	}
}