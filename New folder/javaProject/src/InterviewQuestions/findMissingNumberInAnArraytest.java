package InterviewQuestions;

import java.util.Scanner;

public class findMissingNumberInAnArraytest {
	public static void main(String[] args) {
		
		
		int i,c,j,missingNumber, sum=0,elements=0;
		
		int [] a= new int[4];
		Scanner scan = new Scanner(System.in);
		
		for(i=0;i<a.length;i++) {	
			
			a[i]=scan.nextInt();
		}
		
		for(i=0;i<a.length;i++) {
			
			sum= sum+a[i];
			
		}
		
		
		for(i=1;i<=5;i++) {
			
			elements= elements+i;
			
		}
		missingNumber=sum-elements;
		
		System.out.println("missing number: "+missingNumber);
		

	}
		
}

