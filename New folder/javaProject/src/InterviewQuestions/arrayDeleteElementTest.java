package InterviewQuestions;

import java.util.Scanner;

public class arrayDeleteElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, size, loc;
		int[] a = new int[4];
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter size of the array: ");
		size = scan.nextInt();

		System.out.println("Enter location to delete: ");

		loc = scan.nextInt();
		for (i = 0; i < a.length; i++) {
			
			System.out.println("Enter values in an array: ");

			a[i] = scan.nextInt();

		}

		for (i = 0; i < a.length; i++) {

			System.out.println("Display array values : " + a[i]);
		}

		for (i = loc; i < size - 1; i++) {
			
			a[i]=a[i+1];
			

		}
		
		for(i=0;i<size-1;i++) {
			
			System.out.println("Array with one element which is deleted: "+a[i]);
			
		}

	}

}
