package InterviewQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class armstrongNumber {
	
	///logic 
	
	//input number 153 = 1*1*1+5*5*5+3*3*3=153

	//checking a number is anagram or not.
	static int n;
	static int c;
	static int remainder;
	static int arm = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		n = input.nextInt();
		// securing value of n in the variable c
		c = n;
		checkArmstrong(n);

	}

	public static void checkArmstrong(int num) {
		// TODO Auto-generated method stub

		while (n > 0) {

			remainder = n % 10;
			arm = (remainder * remainder * remainder) + arm;
			n = n / 10;

		}
		
		if(c==arm){
			System.out.println("Its an armstrong number");
			
		}else {
			System.out.println("Its not an armstrong number");
			
			
		}

	}

}
