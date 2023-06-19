package mock;

public class String_ex {
	public static void main(String[] args) {
		String s1="ABCxyz";
		String s2="Abc";
		String s3="";
		String s4=" ";
		String s5="my name is pooja";
		//System.out.println(s5.substring(2));
		System.out.println(s5.substring(3, 6));
		
		String sr[]=s5.split(" ");
		for(int i=0;i<=sr.length-1;i++)
		{
			System.out.println(sr[i]);
		}
		System.out.println(sr[2]);
		
		String s6="Pooja";
		String s7=null;
		String s8="my name is hridhan";
		//System.out.println(s8.indexOf('h'));
		System.out.println(s8.lastIndexOf('a'));
		System.out.println(s8.startsWith("my "));
		System.out.println(s8.endsWith(" hridhan"));
		
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equalsIgnoreCase(s2));
		//System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s5.contains(" is"));
		System.out.println(s6.toUpperCase());
		s6=s6.toUpperCase();
		System.out.println(s6);
		System.out.println(s6.toLowerCase());
		System.out.println(s6);
		s6=s6.toLowerCase();
		System.out.println(s6);
		System.out.println(s6.charAt(3));
		//System.out.println(s7.charAt(1));
		
		
		
		
		
		
		
	}

}
