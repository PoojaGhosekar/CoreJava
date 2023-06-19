package StarPattern;

public class Ex_star2 {
	public static void main(String[] args) 
	{
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				for(int k=1;k<=i;k++)
				{
					System.out.print("-");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
