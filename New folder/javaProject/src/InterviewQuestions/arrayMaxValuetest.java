package InterviewQuestions;

import java.util.Scanner;

public class arrayMaxValuetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, c=0, num,max,min;
		int [] a= new int[5];
		Scanner scan = new Scanner(System.in);
		
		
		
		
		for(i=0;i<a.length;i++) {
			
			
			num=scan.nextInt();
			a[i]=num;
			
			
		}
		
		max=a[0];
		
		for(i=1;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max= a[i];
				
			}
			
		}
		
		System.out.println("maximum value of the array: "+max);
		

	}

}
