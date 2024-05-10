package arrayprograms;

import java.util.Map.*;
import java.util.*;

public class printmaxdupicateinarray 
{
	 public static void main(String[] args) 
	 {
	        int a[]={3,2,4,5,3,5,1,2};
	        int max=0;
	        HashMap<Integer,Integer> map=new  HashMap<Integer,Integer>();
	        for(int i=0;i<a.length;i++)
	        {
	            if(map.containsKey(a[i]))
	            {
	                map.put(a[i],map.get(a[i])+1);
	                
	            }
	            else
	            {
	                map.put(a[i],1);
	            }
	        }
	       // System.out.println(map);
	        for(Entry<Integer,Integer>m:map.entrySet())
	        {
	            if(m.getValue()>1)
	            {
	            	
	            	if(m.getKey()>max)
	            	{
	            		max=m.getKey();
	                 
	            	}
	            }
	        }
	        System.out.println(max);
	    }
}
