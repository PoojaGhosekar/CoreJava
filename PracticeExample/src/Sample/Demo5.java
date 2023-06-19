package Sample;
//calling non-static method within non-static method
public class Demo5 {
	public void m1() {
		System.out.println("running m1 method");
		m2();// calling non-static method inside non-static method
		
	}
	public void m2() {
		System.out.println("running m2 method");
		
	}
	public static void main(String[] args) {
		Demo5 d5=new Demo5();
		d5.m1();
	}

}
