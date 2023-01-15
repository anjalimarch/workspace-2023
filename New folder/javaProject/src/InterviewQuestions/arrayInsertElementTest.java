package InterviewQuestions;

import java.util.Scanner;

public class arrayInsertElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,size,item,loc;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ente size of the array: ");
		size =scan.nextInt();
		System.out.println("ente location to insert the array: ");
		loc =scan.nextInt();
		
		System.out.println("ente itemto inset in to the array: ");
		item =scan.nextInt();
		
		
		int [] a= new int[size+1];
		
		for(i=0;i<size;i++) {
			
			System.out.println("enter values in arrays: ");
			
			a[i]=scan.nextInt();
			
		}
		
		
		for(i=size;i>loc;i--) {
			//until it reaches to location keep shifting the values:
			
			a[i]=a[i-1];
		}
		
		a[loc]=item;
		
		for(i=0;i<a.length;i++) {
			
			System.out.println("arrays in java: "+a[i]);
			
		}

	}

}

