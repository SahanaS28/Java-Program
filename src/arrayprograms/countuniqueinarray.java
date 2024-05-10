package arrayprograms;


import java.util.Map.*;
import java.util.HashMap;
//program to print -1 if there is no duplicate in array,if there is duplicate it should print 1
public class countuniqueinarray {

	public static void main(String[] args) {
        int a[]={3,2,4,5,2};
        int count=0;
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
               
                 count=1;
            }
        }
        if(count==0)
        {
           System.out.println("the give array is unique "+(-1)); 
        }
        else
        {
            System.out.println("the give array is duplicate "+1);
        }
    }
}
