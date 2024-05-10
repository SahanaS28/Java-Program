package test;

public class addtionof2array
{
	public static void main(String[] args) {
//		int a[]= {4,3,1,2,5};
//		int b[]= {3,4,6,7};
//		
//		int[] c=new int[a.length];
//		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<b.length;j++)
//			{
//				if(i==j)
//				{
//					c[i]=a[i]+b[j];
//				}
//				
//							
//			}
//			System.out.println(c[i]);
//		}
//		System.out.println(c[c.length-1]=a[a.length-1]);
		
		//method2
		
		
		int a[]= {4,3,1,2,5};
		int b[]= {3,4,6,7};
		
		int[] c=new int[a.length];
		
		for(int i=0;i<b.length;i++)
		{
			c[i]=b[i];
		}
		c[c.length-1]=0;
		
		for(int j=0;j<c.length;j++)
		{
			System.out.print(a[j]+c[j]);
		}
		
	}

}
