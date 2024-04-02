package stringprograms;

public class printminlengthvalueinarray {

	public static void main(String[] args) {
		String[] s= {"ab","abc","abcd","cd","cdfg"};
		String min=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<min.length())
			{
				min=s[i];
			}
			
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==min.length())
			{
				System.out.println(s[i]);
			}
			
		}
	
	}
}
