package classroom;

//class Student {

//    
//	String name;
//	int rollno;
//	public Student() {
//	    System.out.println("default constructor called");
//	}
//
//     void display() {
//    	    System.out.println(name+" "+rollno);
//     }
//}
//
//public class constructor{
//	public static void main(String[] args) {
//		Student s1=new Student();
//		s1.display();
//		
//	}
//}

class Student {
	String name;
	int rollno;

	Student(String name, int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
	Student(Student s){
		name=s.name;
		rollno=s.rollno;
	}

	void display() {
		System.out.println(name + " " + rollno);
	}
}

public class constructor{
	public static void main(String[] args) {
		
	
		Student s1=new Student("Rahul",1);
		Student s2=new Student(s1);  /* Copy constructor*/
		s2.display();
		
		
	}
}


