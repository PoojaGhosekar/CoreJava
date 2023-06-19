package mock;

public class CountCharacterInString {
	public static void main(String[] args) {
		String s1="good morning everyone";
		int count=0;
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
