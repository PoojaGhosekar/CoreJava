package Sample;

//Program to print out the reverse number

public class Demo1_reverseNo {
	public static void main(String[] args) {
		int n=1234;
		int i=1;
		while(i<=4)
		{
			int rem;
			rem=n%10;
	        System.out.print(rem);
	        n=n/10;
			i++;
		}
		
	}

}
