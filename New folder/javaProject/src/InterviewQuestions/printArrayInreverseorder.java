package InterviewQuestions;

import java.util.Scanner;

public class printArrayInreverseorder {
	
	
	
	public static void main(String args[]){
		
		int [] a = new int[9];
		int [] b = new int[9];
		
		int i,k=0;
		Scanner r = new Scanner(System.in);
		
		for(i=0; i<a.length ;i++){
			
			a[i]=r.nextInt();
			
			
			
			
		}
		
		for(int j=a.length-1; j>=0;j--){
			
			
			b[j]=a[k];
			k++;
			
			
		}
		
		
		for(int l=0;l<a.length;l++) {
			
			System.out.println("array of elements:"+a[l]+"reverse array of elements:"+b[l]);
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
