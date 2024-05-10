package arrayprograms;

public class rotatetillparticularposition {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,0,3,4};
	int pos=8;
	for(int i=0;i<a.length;i++)
	{
		if(pos>0)
		{
			System.out.println(a[--pos]+" ");
		}
		else
		{
			System.out.println(a[i]+" ");
		}
	}
}
}
