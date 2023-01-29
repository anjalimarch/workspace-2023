package InterviewQuestions;

import java.util.Scanner;

public class sumOfArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,sum=0, sumOfarray;
		int [] a= new int[3];
       
       Scanner scan = new Scanner(System.in);
       
       
       for(i=0;i<a.length;i++){
    	   
    	   a[i]=scan.nextInt();
    	   sum= sum+a[i];
    	   
    	   sumOfarray=sum;
    	   System.out.println("sum of arrays :"+sumOfarray);
    	   
     }

}

}
