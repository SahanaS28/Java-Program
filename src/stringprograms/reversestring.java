package stringprograms;

public class reversestring {
public static void main(String[] args) 
{
	
	//method1
//	String s="Bangalore";
//
//	for (int i = s.length()-1; i>=0 ;i--) 
//	{
//		System.out.println(s.charAt(i));
//	}/
	
	//method2
	
//	String s="bangalore";
//	char c[]=s.toCharArray();
//	for(int i=s.length()-1;i>=0;i--)
//	{
//		System.out.println(c[i]);
//	}
	
	//method3
	
//	String s="bangalore";
//	String rev="";
//	for(int i=s.length()-1;i>=0;i--)
//	{
//		rev=rev+s.charAt(i);
//	}
//	System.out.println(rev);
	
	//method4
	StringBuffer s=new StringBuffer("Banglaore");
	System.out.println(s.reverse());
}
}
