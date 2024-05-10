package pattern;

public class forthtraiangleabcd {
	public static void main(String[] args) 
    { 
        char ch='f';
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(ch-i)+" ");
            }
             System.out.println(" ");
        }
    }
}
