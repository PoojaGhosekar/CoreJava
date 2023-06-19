package Casting;

public class Demo1 {
	public static void main(String[] args) {
		int a=10;
		long b=a;
		System.out.println(b);//Implicit casting(lower to higher)
		
		
		long c=10000000;
		int d=(int)c;
		System.out.println(d);//Explicit casting(higher to lower)
		
		
		float f1=10.55f;
		double d1=f1;//Implicit casting(lower to higher)
		System.out.println(d1);
		
		
		double d2=10.50;
		float f2=(float)d2;//Explicit casting(higher to lower)
		System.out.println(f2);
		
		
		char c1='A';
		int a1=(int)c1;
		System.out.println(a1);
		
		char c2='B';
		float a2=(int)c2;
		System.out.println(a2);
		
		char c3='D';
		//String s1=(String)c3;
		//System.out.println(s1); Cannot convert from char to string
		String s1 ="JAVA";
		//char a2=(char)s1;
		//System.out.println(a2);  Cannot convert from string to char
		
		boolean b1=true;
		//int num1=(int)b1;Cannot convert from boolean to int and int to boolean
		
		byte b2=10;
		int num2=b2;
		System.out.println(num2);//Implicit casting
		
		
		int num3=20;
		byte b3=(byte)num3;
		System.out.println(b3);//Explicit casting
		
	}

}
