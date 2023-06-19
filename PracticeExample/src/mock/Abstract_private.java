package mock;

abstract public class Abstract_private {
	 static int a;
	Abstract_private()
	{
		a=10;
	}
	public static void m2()
	{
		 a=20;
		System.out.println(a);
	}
	public void m1()
	{
		System.out.println(a*a);
	}
	public static void main(String args[])
	{
		Abstract_private.m2();
	}

}
