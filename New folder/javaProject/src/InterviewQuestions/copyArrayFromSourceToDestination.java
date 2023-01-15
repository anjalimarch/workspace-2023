package InterviewQuestions;

import java.util.Scanner;

public class copyArrayFromSourceToDestination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= new int[4];
		int i;
		int [] b= new int[4];
		Scanner scan = new Scanner(System.in);
		
		for(i=0;i<a.length;i++) {
		
		a[i]=scan.nextInt();
		
		
		
		}
		
		for(i=0;i<=a.length-1;i++) {
			
			System.out.println("array to enter in the system"+a[i]);
			
			b[i]=a[i];
			
			System.out.println("array copy from a to b:=="+b[i]);
		}
		
		
		
		
		
		
	}

}
