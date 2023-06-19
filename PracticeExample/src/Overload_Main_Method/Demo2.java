package Overload_Main_Method;
//program for reverse string
public class Demo2 {
	
	public static void main(String[] args) {
		String s1="pooja";
	
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
          rev=rev+s1.charAt(i);
          
			
		}
		System.out.println(rev);
	}

	
}
