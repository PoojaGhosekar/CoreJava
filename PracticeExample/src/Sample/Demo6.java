package Sample;
//calling non-static method inside static method
public class Demo6 {
	public static void m1() {
		System.out.println("running static method m1");
		
		Demo6 d6a=new Demo6();
		d6a.m2(); // calling non-static method inside static method
		
	}
	public void m2() {
		System.out.println("running non-static method m2");
		
	}
	public static void main(String[] args) {
		m1();
		Demo6 d6=new Demo6();
		//d6.m2();
	}

}
