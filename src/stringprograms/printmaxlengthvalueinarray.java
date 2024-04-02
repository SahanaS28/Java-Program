package stringprograms;

public class printmaxlengthvalueinarray {
	public static void main(String[] args) 
	{
		String[] s= {"ab","abc","abcd","cd","cdfg"};
		String max=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>max.length())
			{
				max=s[i];
			}
			
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==max.length())
			{
				System.out.println(s[i]);
			}
			
		}
	
	}
}
