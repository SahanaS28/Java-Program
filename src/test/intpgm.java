package test;

public class intpgm {

	void sum(int a, double b)
	{
		System.out.println("a method invoked");
	}
	void sum(String a,int b)
	{
		System.out.println("b method invoked");
	}
	public static void main(String[] args) {
	
		intpgm i=new intpgm();
		i.sum(20, 20);
	}
}
