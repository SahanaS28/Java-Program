package pattern;

public class Secondquad {
public static void main(String[] args) {
	int n=5;

	for (int i = 1; i <=n; i++) 
	{
		for (int j = i; j <n; j++) 
		{
			System.out.print("  ");//two space
			
			
		}
		for (int j = 1; j <=i; j++) 
		{
			System.out.print("* ");
			
			
		}
		System.out.println();		
	}
}
}
