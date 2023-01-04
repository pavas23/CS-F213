class Student{
	private int id;
	private String name;
	private int age;
	private int[] marks = {0,0,0};
	
	// constructor
	Student(int user_id, int user_age, String user_name){
		id = user_id;
		age = user_age;
		name = user_name;
	}
	public void setMarks(int m1,int m2,int m3){
		marks[0] = m1;
		marks[1] = m2;
		marks[2] = m3;
	} 
	public void studentDetails(){
		System.out.println("The id of the student is: "+id);
		System.out.println("The name of the student is: "+name);
		System.out.println("The age of the student is: "+age);
		System.out.println("The marks of the student are: ");
		for(int i=0;i<3;i++){
			System.out.print(marks[i] + " ");
		}
		System.out.println();
	}
	
}
class StudentDemo{
	private Student s1 = new Student(105,21,"Raj");
	private Student s2 = new Student(109,23,"Gopal");
	public void displayDetails(){
		s1.setMarks(67,90,65);
		s2.setMarks(70,68,49);
		s1.studentDetails();
		s2.studentDetails();
	}
	
}
public class q5{
	public static void main(String[] args){
		StudentDemo sd = new StudentDemo();
		sd.displayDetails();
	}
}
