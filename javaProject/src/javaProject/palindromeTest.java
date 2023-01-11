package javaProject;

public class palindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "MadaM"; 
       palindromeTest(s);
	}

	public static void palindromeTest(String s) {
		// TODO Auto-generated method stub
		int j= s.length()-1;
		char temp;
		char [] a= s.toCharArray();
		
		
		for(int i=0; i<j;i++){
			
			if(i>=j) {
				return;
				
			}else {
			temp = a[i];
			a[i]=a[j];
			a[j]=temp;
				
				j--;
				
			}
			
			
		}
		
		if (s.equals(String.valueOf(a))){
			
			
			System.out.println("its a palindrome");
		};
	}
	

}
