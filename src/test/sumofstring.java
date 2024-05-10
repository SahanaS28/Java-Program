package test;

import strings.integerpalindrome;

public class sumofstring {
public static void main(String[] args) {
	String s="134abc";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		
//		char c= s.charAt(i);
//		int n=Integer.parseInt(String.valueOf(c));
		int n=s.charAt(i)-48;
		sum=sum+n;
				
	}
	System.out.println(sum);
	
//	String s="Rdh34aa950";
//	boolean flag=true;
//	int up=0;
//	int lc=0;
//	int digit=0;
//	
//	if(s.length()>=8 && s.length()<=16 && !s.contains(" "))
//	{
//			for(int i=0;i<s.length()-1;i++)
//			{
//				if(s.charAt(i)==s.charAt(i+1))
//				{
//                   flag=false;
//                   break;
//				}
//			}
//			for(int i=0;i<s.length();i++)
//				{
//				
//					if(Character.isDigit(s.charAt(i)))
//					{
//					 digit++;
//					}
//					else if(Character.isUpperCase(s.charAt(i)))
//					{
//						 up++;
//					}
//					else if(Character.isLowerCase(s.charAt(i)))
//					{
//						 lc++;
//					}
//					
//				}
//			if(digit<1||lc<1||up<1)
//			{
//				flag=false;
//			}
//			
//			
//	}
//	else
//	{
//		flag=false;
//	}
//	if(flag==true)
//		{
//			System.out.println("valid password");
//		}
//	else
//		{
//			
//			System.out.println("Invalid password");
//			
//		}
//	
	
}
}
