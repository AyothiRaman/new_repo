package demo;

public class mainclass1 
{
public static void main(String[] args) 
{
	
	int count=0;
	String s=new String("ayothi raman");
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			System.out.print(s.charAt(i)+" ");
		}
	}
}
}
