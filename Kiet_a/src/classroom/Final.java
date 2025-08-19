package classroom;

class Test {

	final int a=10;
	final int b=20;
	
	final int add() {
		int c=a+b;
		return c;
	}
	
}

public class Final{
	public static void main(String[] args) {
	      Test t=new Test();
	      t.a=20;
	      t.b=30;
	      int b; 		  System.out.println(t.a+" "+t.b+" "+t.add());
	
	}
}