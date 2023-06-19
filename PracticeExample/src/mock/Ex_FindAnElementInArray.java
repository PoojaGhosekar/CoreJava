package mock;

public class Ex_FindAnElementInArray {
	public static void main(String[] args) {
		int ar[]= {10,5,50,40,90};
		int num=10;
		boolean isInArray=false;
		for(int element:ar)
		{
			if(num==element)
			{
				isInArray=true;
				break;
			}
			
		}
		if(isInArray)
			System.out.println("The element is present in array");
		else
			System.out.println("The element is not present in array ");
		
	}

}
