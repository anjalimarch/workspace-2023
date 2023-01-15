package InterviewQuestions;

import java.util.Arrays;

public class printArrayInjava{
	
	public static void main(String args[]) {
		
		
		int  a[]= {231,1,3,6,9,0,12,133};
		int [] b= {500,402,501,301,299};
		
		
		System.out.println(a[2]);
		System.out.println(b[3]);
		
		int [] c= new int[5];
		int j=5;
		for(int i=0; i<c.length;i++){
			
			c[i]=j;
			System.out.println(c[i]);
			j++;
			
			
			
		}
		
		
		
		
	}
	
}