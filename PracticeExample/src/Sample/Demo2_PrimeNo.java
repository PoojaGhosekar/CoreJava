package Sample;
//Program to find the prime no
public class Demo2_PrimeNo {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			int j=0;
			for(int n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					j=j+1;
				}
			}
			if(j==2)
			{
				System.out.println(i);
			}
		}
		
	}

}
