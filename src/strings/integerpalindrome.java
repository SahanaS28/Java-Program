package strings;

public class integerpalindrome
{
	public static void main(String[] args) {
		int no=1001;
		int copy=no;
		int rev=0;
		int rem;
		
				while(no!=0)
				{
					rem=no%10;
					 rev=(rev*10)+rem;
					no=no/10;
				}
				if(copy==rev)
				{
					System.out.println("palindrome");
				}
				else
				
					{
						System.out.println("not palindrome");
					}
				
	}

}
