package classroom;

class student{
	private String name;
	private int rollno;
	private int marks;
	
	student(String name, int rollno, int marks){
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	
	int getmarks() {
		return marks;
	}
	
	public void setmarks(int marks) {
		if(marks >=0 && marks <=100) {
			this.marks=marks;
			System.out.println("marks updated");
		}
		else {
			System.out.println("invalid marks");
		}
	}
	
	public void display() {
		System.out.println("Name:"+name+ ","+"rollno "+rollno+ ","+"marks: "+marks);
	}
}



public class Encapsule {

	public static void main(String[] args) {
		student s1=new student("Rahul",1,70);
		
		s1.display();
		
		s1.getClass();
		
		s1.setmarks(50);
		System.out.println("updated marks "+s1.getmarks());
		
	}

}
