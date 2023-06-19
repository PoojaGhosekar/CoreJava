package Overload_Main_Method;

public class Demo {
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		int intarray[]= {10,20,30,40,50}; 
		main(intarray);
		main(10,20);
		
	}
    public static void main(int[] intarray)
    {
	System.out.println("Main method with integer array parameters");
    }
    public static void main(int a,int b)
    {
	System.out.println("Main method with two integer parameters");
    }
}
