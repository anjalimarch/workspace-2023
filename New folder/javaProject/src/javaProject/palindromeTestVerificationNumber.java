package javaProject;

import java.util.Scanner;

public class palindromeTestVerificationNumber {
	static int num,c, remainder,logic=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input=new Scanner(System.in);
		num= input.nextInt();
		c=num;
       palindromeTest(num);
	}

	public static void palindromeTest(int num) {
		// TODO Auto-generated method stub
			
			while(num>0){
			 remainder=num%10;
			  logic=(logic*10)+remainder;
			 num=num/10;
			}
			
			if(c==logic) {
				System.out.println("Yes");
				
			}else{
				System.out.println("No");
				
			}
		
		
		
		
	}
		
	}
	


