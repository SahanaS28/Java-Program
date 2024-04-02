package test;



public class lengthofstring 
{
public static void main(String[] args)
{
	String st="I am from Bangalore";
    int count=0;
    String sr=st.replace(" ","");
    char[] s=sr.toCharArray();
    String rev="";
	for (int i = 0; i < s.length; i++) 
	{
		
		
		rev=rev+s[i];
		count++;
		
		
	}
	System.out.println(count);
}
}
