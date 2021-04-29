package arrays;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		
		int[] a = { 10, 20, 30, 40 }; 
		int[] b = {20,10,1}; 
		merge(a,b);
	
       
        }
	public static void  merge(int[] x, int[] y)
	{
		 if(x.length>0 && y.length>0) 
	        {
	        	int a1 = x.length; 
	        	int b1 = y.length; 
	        	int c1 = a1 + b1; 
	        	int[] c = new int[c1]; 
	        	 
	        	System.arraycopy(x, 0, c, 0, a1); 
	             System.arraycopy(y, 0, c, a1, b1); 
	             Arrays.sort(c);
	       	  System.out.println(Arrays.toString(c));
	            
	           
	        }
	        else
	        {
	        	System.out.println("0");
	        }
	}

}
