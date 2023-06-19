package Sample;

public class Armstrong_Example {
	public static void main(String[] args) {
		int n=1634,rem,j=0,k=0;//1+125+27=153
		int temp=n;
		while(n>0)
		{
		rem=n%10;//1
		n=n/10;//0
		j=rem*rem*rem*rem;//1
		
		k=k+j;//27+125=152+1
		
		}
		//System.out.println(temp);
		//System.out.println(armstrong);
		if(k==temp)
		{
		System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
		
	}
	

}
