package stringprograms;

public class countvopwels
{
	public static void main(String[] args) {
	
	String st="India";
	String sr=st.toLowerCase();
	char[] s=sr.toCharArray();
	int count=0;
	for (int i = 0; i < s.length; i++)
	{
		if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
		{
			count++;
			System.out.print(s[i]+" "+count);
			System.out.println();
		}
	}
	System.out.println();
	System.out.println("count="+count);
	}
}
