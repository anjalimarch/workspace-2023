package InterviewQuestions;

import java.util.Scanner;

public class findArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] a= new int[4];
     int n,i,c=0;
     
     Scanner scan =new Scanner(System.in);
     for(i=0;i<a.length;i++){
      System.out.println("enter elements in an array:");
       a[i]=scan.nextInt();
       
       
     }
     System.out.println("Entering value in number to be found ");
     n= scan.nextInt();
     for(i=0;i<a.length;i++){
     if(n==a[i]) {
    	 
    	 c++;
    	 
     }
     System.out.println("value of the element in an array: "+c);
     }
	}

}
