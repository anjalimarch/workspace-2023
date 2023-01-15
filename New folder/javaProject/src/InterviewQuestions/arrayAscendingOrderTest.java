package InterviewQuestions;

import java.util.Scanner;

public class arrayAscendingOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //int [] a//= new int[5];
      
      int [] a= {89,78,9,45,32,67};
      int i,r,j,temp;
    //  Scanner scan= new Scanner(System.in);
      for(i=0;i<a.length;i++){
    	  
    	  //r=scan.nextInt();
    	  
    	//  a[i]=r;
    	  
    	  System.out.println("array to be sorted in asceding "+a[i]);
    	   	  
      }
      
      
      for(i=0;i<a.length;i++) {
    	  
    	  for(j=i+1;j<a.length;j++) {
    		  
    		  
    		  if(a[i]>a[j]) {
    			  
    			 temp=a[i];
    			 a[i]=a[j];
    			 a[j]=temp;
    			  
    			  
    		  }
    	  }
    	  
      }
      
      for(i=0;i<a.length;i++) {
    	  System.out.println(a[i]+" ");
    	  
      }


	}

}
