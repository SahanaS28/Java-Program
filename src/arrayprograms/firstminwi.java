package arrayprograms;

public class firstminwi {
public static void main(String[] args) {
	int a[]= {1,9,7,0};
	int fmin=0;
	for(int i=0;i<a.length;i++)
	{
		if(fmin>a[i])
		{
			fmin=a[i];
		}
	}
	System.out.println(fmin);
}
}
