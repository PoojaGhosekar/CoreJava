package Sample;
//Example of Method overloading with static method
public class CompileTWithStatic {
	public static void m1(int a)
	{
		System.out.println(a*a);
	}
	public static void m1(int b,int c)
	{
		System.out.println("number1:" +b+" "+"number2: "+c);
	
	}
	public static void main(String[] args) {
		CompileTWithStatic.m1(10);
		CompileTWithStatic.m1(20, 40);
	}

}
