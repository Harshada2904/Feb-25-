import java.util.*;
class Employee{
	int id;
	String name;
	double sal;
	
	Employee(int id, String name, double sal){

		this.id = id;
		this.name = name;
		this.sal = sal;
	
	}


}

class EmployeeDemo{
	public static void main(String args[]){
	Employee e[] = new Employee[15];
	Scanner sc = new Scanner(System.in);
	for(int i = 0;i<e.length;i++){
		System.out.println(" Enter your id ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println(" Enter your name ");
		String name = sc.nextLine();
		System.out.println(" Enter your salary ");
		double sal = sc.nextDouble();
		
	e[i] = new Employee(id,  name,  sal);
	
	
	}
	
	for(int i = 0;i<e.length;i++){
		System.out.println(e[i].id);
		System.out.println(e[i].name);
		System.out.println(e[i].sal);
	}
	
	
	}


}