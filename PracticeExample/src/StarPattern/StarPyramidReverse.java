package StarPattern;

public class StarPyramidReverse {
	public static void main(String[] args) {
		int star =5;
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
				
			}
			//star--;
		}
	}

}
