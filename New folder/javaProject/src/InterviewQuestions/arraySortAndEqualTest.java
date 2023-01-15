package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class arraySortAndEqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[4];
		int[] b = new int[4];
		int i, j;
		boolean variableValue;

		Scanner scan = new Scanner(System.in);

		for (i = 0; i < a.length; i++) {

			a[i] = scan.nextInt();
			System.out.println("arrays a:  "+a[i]);

		}

		for (i = 0; i < b.length; i++) {

			b[i] = scan.nextInt();
			
			System.out.println("arrays b: "+b[i]);

		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		for (i = 0; i < b.length; i++) {

			System.out.println(" "+a[i] );
			
			System.out.println(" "+b[i]);

		}
		
		
		boolean arrayEquivalence= Arrays.equals(a, b);
		
		System.out.println("equivalence of array: "+ arrayEquivalence);
		
		
		
		

	}

}
