package classroom;

class student{
    private	String name;
	private int rollno;
	private int marks;
	
	student(String name, int rollno, int marks){
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	public int getmarks() {
		return marks;
	}
	
	public void setmarks(int marks) {
		if(marks >=0 && marks <=100) {
			this.marks=marks;
			System.out.println("marks updated");
		}
		else {
			System.out.println("Invalid marks");
		}
	}
	
	void display() {
		System.out.println("name:"+name+" "+"rollno: "+rollno+ " "+"marks: "+marks);
	}
}




public class encapsulation {
   public static void main(String[] args) {
	   student s1=new student("Rahul", 1,75);
	   System.out.println(s1.getmarks());
	   
	   s1.display();
	   s1.setmarks(45);
	   System.out.println(s1.getmarks());
	   
	   s1.display();
}


}
