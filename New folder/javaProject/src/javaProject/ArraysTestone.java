package javaProject;

public class ArraysTestone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello world java");

      int [] x= {12,13,14,15,16,17};
      
      int [] b= new int[6];      
      
      int size= x.length;
      
      for(int i =0; i<size;i++){
    	  
    	 // System.out.println(x[i]);
    	  	 
    	  b[i]=x[size-(i+1)];
    	  
    	  System.out.println(b[i]);
    	  
      }
	}

}
