package test;

import java.util.HashMap;

public class intpgm2 {
public static void main(String[] args) {
	String s[]= {"Apple", "Pomogranate", "Straberries", "watermelon","green grapess"};
	int a[]= {1,2,3,4,5};
	
	HashMap<Integer,String> map=new HashMap<Integer,String>();
			for(int i=0;i<s.length;i++)
			{
				
					
						map.put(a[i],s[i]);
					
					
					
				
				
			}
			System.out.println(map);
			}
			
	

}
