package arrayprograms;

public class indexofsumequalstotarget 
{
	public static void main(String[] args) 
    {
          int[] arr={2,3,4,5,6,3,9,7,1};
          int sum=0;
          int target=10;
          for(int i=0;i<arr.length;i++)
              {
                  for(int j=i+1;j<arr.length;j++)
                  {
                      sum=arr[i]+arr[j];
                      if(sum==target)
                      {
                          System.out.println("index are "+i+" "+j);
                      }
                      
                  }
              }     
     }
	
}

