package methodoverloading;

public class Demo1 {
	public void m1()
	{
	System.out.println("m1");	
	}
	public int m1(int a)
	{
		System.out.println(a);
		return 0;
	}
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.m1();
		d1.m1(10);
	}

}
