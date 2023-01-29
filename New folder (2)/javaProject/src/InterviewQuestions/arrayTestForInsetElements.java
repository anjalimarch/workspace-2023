package InterviewQuestions;

import java.util.Scanner;

public class arrayTestForInsetElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []= new int[10];
		int i;
		Scanner r= new Scanner(System.in);
		
		for(i=0; i<a.length;i++) {
			
			
			
			System.out.println("Enter values in arrays in run time");
			
			a[i]=r.nextInt();
			
			
			
		}
		for(i=0; i<a.length;i++) {
			
			System.out.println("java arrays "+a[i]);
		}
		
	}

}
