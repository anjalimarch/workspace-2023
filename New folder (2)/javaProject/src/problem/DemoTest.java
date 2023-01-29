package problem;

import java.util.Scanner;

public class DemoTest {
	
	            int i,j, temp;
	            
	
		
		        public String convertToTitle(int n) {

		            if (n <= 0) {
		            	
		                return "";
		        }

		       StringBuilder sb = new StringBuilder();
		          while (n > 0) {

		                // @note: key is, not n, but n-1
		        	  
		                  int remainder = (n-1 ) % 26;
		                  sb.insert(0, (char)('A' + remainder)); // @note: reverse order

		                  n = (n-1) / 26;
		              }

		            return sb.toString();
		            
		       }
		    
		        
		        
		        	public int titleToNumber(String c) {
		        	int count=0;
		        	for(int i=0;i<c.length();i++)
		        	{
		        	count=count*26;
		        	count=count+(c.charAt(i)-'A'+1);
		        	}
		        	return count;
		        	}
		        	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         DemoTest d = new DemoTest();
		
	     int a= 701;
	     String s=d.convertToTitle(a);
		
	     int num=d.titleToNumber(s);
	     System.out.println(num);
	    
     
	}

}
