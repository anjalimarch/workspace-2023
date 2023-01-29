package problem;

import java.util.Scanner;

public class ReverseEachWordTest {

	int i, j;
	String temp = " ";

	String finalString = " ";

	public void reverseEachWordOftheSring(String data) {

		String[] a = data.split(" ");

		String[] output = new String[a.length];

		for (String b : a) {

			System.out.println(b);
			int j = b.length() - 1;

			for (i = j; i >= 0; i--) {

				temp = temp + b.charAt(i);

				

			}
			temp= temp+" ";
			

		}

		
		  
		  
		  System.out.println(temp); //}
		  
		  }
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseEachWordTest r = new ReverseEachWordTest();

//		Scanner s= new Scanner(System.in);
//		String data=s.next();

		String data = "Unbeliable Rsources Doing Nonsence";

		r.reverseEachWordOftheSring(data);
	}

}
