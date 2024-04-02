package test;

public class perfectrotation {
public static void main(String[] args)
{
//	String s="I am from Bangalore";
//	String[] st=s.split(" ");
//	for (int i = 0; i < st.length; i++)
//	{
//		String first=st[0];
//		for (int j = 0; j < st.length-1; j++) 
//		{
//			st[j]=st[j+1];
//			
////			System.out.print(st[j]+" ");
//		}
//		st[st.length-1]=first;
//		for (int k = 0; k < st.length; k++)
//		{
//			System.out.print(st[k]+" ");
//		}
//		System.out.println();
	
	String s="how are you";
	String[] st=s.split(" ");
	for(int i=0;i<st.length;i++)
	{
		String temp=st[0];
		for(int j=1;j<st.length;j++)
		{
			st[j-1]=st[j];
			System.out.print(st[j]+" ");
		}
		st[st.length-1]=temp;
		System.out.println(temp);
		
	}
	
	 		

}
}
