package javaProject;

public class StringTestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///String s= "Anjali Mishra Online Unavailable for shit as she prefer studying rather than doing nonsence";


//o/p="nonsence ...Anjali" 
		
		String s= "AnjaliMishra";
		char[] a= s.toCharArray();
		
		
		reverseString(a);
		
		
		for(int j=0; j<a.length;j++) {
		System.out.println(a[j]);
		}



	}

	public static void reverseString(char b[]){
		
		int size= b.length;
		
		for(int i=0;i<size; i++){
			
			int end = size -(i+1);
			if (i>=end)
                return;
			char temp= b[end];
			b[end]= b[i];
			b[i]=temp;
			
			
		}
		
		
		
		
	}
	
}
