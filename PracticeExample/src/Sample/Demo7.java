package Sample;

public class Demo7 {
	int a;
	int b;
	int c;
	Demo7()
	{
		a=10;
		b=20;
		System.out.println(a+b);
		
	}
	Demo7(int x)
	{
		//this();
		c=x;
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Demo7 d7=new Demo7();
		Demo7 d7a=new Demo7(50);
	}

}
