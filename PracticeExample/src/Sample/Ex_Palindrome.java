package Sample;
// A program to find out the palindrome number
public class Ex_Palindrome {
	public static void main(String[] args) {
		int rem,tem,j=0;
		int n=121;
		tem=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			j=(j*10)+rem;
		    
		}
		if(tem==j)
		{
		System.out.println("Number is palindrome");	
		}
		else
		{
			System.out.println("Number is not palindrom");
		}
		
		
		
	}

}
