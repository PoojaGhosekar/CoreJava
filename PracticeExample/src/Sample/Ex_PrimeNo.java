package Sample;

public class Ex_PrimeNo {
	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i=i+1)
		{
			int count=0;
			for(int n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					
				count=count+1;
				}
				
			}
			if(count==2)
			{
				System.out.println(i);
			}
			
		}
		
	}

}

