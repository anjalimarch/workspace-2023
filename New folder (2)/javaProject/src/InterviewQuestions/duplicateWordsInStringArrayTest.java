package InterviewQuestions;

import java.util.Scanner;

public class duplicateWordsInStringArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, c = 0;
		String[] a = new String[5];

		Scanner scan = new Scanner(System.in);

		System.out.println("Entering string in variable: ");
		for (i = 0; i < a.length; i++) {
			a[i] = scan.next();

		}

		for (i = 0; i < a.length; i++) {

			System.out.println("Printing strings in java: " + a[i]);

		}

		for (i = 0; i < a.length; i++) {

			for (j = i + 1; j < a.length; j++) {

				if (a[i].equals(a[j])) {

					System.out.println("finding array values which are repeated: " + a[i]);
					c++;
					System.out.println("number of times values of the arrays:  " + c);
				}
			}

		}

	}
}
