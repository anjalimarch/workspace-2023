package javaProject;

public class ArrayTesttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] a= new int[9];
		
		
		int [] a= {13,78,98,60,65,45,34,23};
		
		
		      arrayReverse(a);
              for(int j=0;j<a.length;j++) {
			
			
			System.out.println("final array"+a[j]);
			
			
		}
	
		
	}	
		
		
		

	

public static void arrayReverse(int a[]){
	
	int size= a.length;
	int temp;
    for(int i=0;i<size;i++) {
			
			int end = size-(i+1);
			
			if(i>=end)
				return;
			
			temp= a[end];
			
			a[end]=a[i];
			
			a[i]=temp;
			
	
			
			
			
		}

}}
