package classroom;

class stu {

      String name;
      int rollno;
      
      stu(String name, int rollno){
    	     this.name=name;
    	     this.rollno=rollno;
      }
      
      void read() {
    	     System.out.println("Reading");
      }
      
      void write() {
    	     System.out.println();
      }
}

public class student{
	public static void main(String[] args) {
		stu s1=new stu("Rahul", 1);
		s1.read();
		s1.write();
		s1.name="Raj";
		s1.rollno=2;
	}
}


