package pattern;

public class secondabbtraingle {
	public static void main(String[] args)  
    { 
        char ch='a';
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i+j>=n+1)
                {
                System.out.print(ch);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            ch++;
             System.out.println(" ");
        }
    }
}
