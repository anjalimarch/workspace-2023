package InterviewQuestions;

import java.util.Scanner;

public class arrayMinValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,num,min,c=0;
		int [] a= new int[5];
		
		
		Scanner scan = new Scanner(System.in);
		for(i=0; i<a.length;i++) {
		
		      a[i]=scan.nextInt();

	      }
		min= a[0];

		for(i=1; i<a.length;i++) {
			
			
			if(a[i]<min) {
				
				
				min=a[i];
				
				
			}
		}
		
		System.out.println("Minimum value of the array min"+min);
		
		
}
}
