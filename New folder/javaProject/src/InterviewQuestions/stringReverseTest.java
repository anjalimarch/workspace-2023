package InterviewQuestions;

import java.util.HashMap;

public class stringReverseTest {
	
	// checking a number is anagram or not. 
	

		static String r1;
	    static String r2;

	public static void main(String[] args) {
		
	r1="Madam";
	r2="";
		checkStringIsAnagram(r1);
		
	}

	public static void checkStringIsAnagram(String input) {
		// TODO Auto-generated method stub
		
		
		for(int i =input.length()-1;i>=0;i--) {
			
			
			r2=r2+input.charAt(i);
			
		}
		
		System.out.println("updated string in reverse order"+r2);
		
		
		
		if(r1.equals(r2)) {
			
			System.out.println("Strign is an anagram");
		}else {
			
			System.out.println("String is an anagram");
		}
				
	}
			
		
		
		
				
	}


