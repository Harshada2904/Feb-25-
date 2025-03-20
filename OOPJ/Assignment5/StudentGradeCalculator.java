import java.util.InputMismatchException;
import java.util.Scanner;
class Student{
	 private String name;
	private int rollNo;
	private double[] marks = new double[5]; 
	private double average;
	private char grade;

	public Student(String name, int rollNo, double[] marks){
		this.name = name;
		this.rollNo = rollNo;
		
		for(int i=0;i<5;i++){
			if(marks[i] <0  || marks[i] >100){
				throw new IllegalArgumentException("invalid marks at subject"+(i + 1));
			
			}
				this.marks[i] = marks[i];
		}
		
	}

	public void calculateAverage(){
		double total = 0;
		for(double m : marks){
			total +=m;
		
		}
			average = total / 5;
	}

	public void calculateGrade(){
		if(average>=90){
			grade = 'A';
		}else if(average >=80 && average < 90){
			grade = 'B';
		}else if(average >=80 && average<80){
			grade = 'C';
		}else if(average>=60 && average<70){
			grade = 'D';
		}else{
			grade = 'F';
		}
	}
	
	public void displayStudentInfo(){
		System.out.println("student name "+name);
		System.out.println("student rollno "+rollNo);
		System.out.println("student marks ");
		for(double m :marks){
			System.out.println(m + "");
		}
		System.out.println("Total average "+average);
		System.out.println("grade "+grade);
	
	} 
}	
	public class StudentGradeCalculator{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name = "";
        int rollNo = 0;
        double[] marks = new double[5];
		try{
			System.out.println("Enter student name ");
			name = sc.nextLine();
			
			System.out.print("Enter Roll Number: ");
            rollNo = sc.nextInt();
			
			System.out.println("Enter Student marks");
			for(int i = 0;i<5;i++){
				System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = sc.nextDouble();
			
			}
			
			Student s = new Student(name, rollNo,marks);
			s.calculateAverage();
            s.calculateGrade();
            s.displayStudentInfo();
			
		}catch(InputMismatchException e){
			System.out.println("Enter only name....");
		
		
		}catch(IllegalArgumentException e){
			System.out.println("Enter valid marks....");
		}
	}
	
	}
