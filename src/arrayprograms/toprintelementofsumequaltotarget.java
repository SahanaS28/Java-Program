package arrayprograms;

import java.util.LinkedHashMap;

public class toprintelementofsumequaltotarget
{
	public static void main(String[] args) 
    {
          int[] arr={2,3,4,5,6,3,9,7,1,7};
          int sum=0;
          int target=10;
          LinkedHashMap
          <Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
          for(int i=0;i<arr.length;i++)
              {
                  for(int j=i+1;j<arr.length;j++)
                  {
                      sum=arr[i]+arr[j];
                      if(arr[i]+arr[j]==target)
                      {
                          if(!map.containsKey(arr[i]) && 
                          !map.containsValue(arr[j]))
                          {
                              map.put(arr[i],arr[j]);
                          }
                        
                          
                          
                      }
                      
                  }
              }   
              System.out.println(map);
     }

}
