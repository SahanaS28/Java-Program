package arrayprograms;

public class max1st {
	public static void main(String[] args) {
		int a[]= {1,9,7,0};
		int fmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				fmax=a[i];
			}
		}
		System.out.println(fmax);
	}
}
