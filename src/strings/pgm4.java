package strings;

public class pgm4 
{
public static void main(String[] args) 
{
	//1234  34  12
	String s="ab12cd34ef1234";
	String[] s1=s.split("[^0-9]");
	
	for(int i=s1.length-1;i>=0;i--)
	{
		
		System.out.print(s1[i]+" ");
	}
	
}
}
