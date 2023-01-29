package problem;

public class ReverseStringWordsTest {
	
	int i,j;
	String temp;
	
	public String[] reverseStringWords(String s) {
		
		String [] a= s.split(" ");
		j=a.length-1;
		
		for(i=0;i<=j;i++)
			
	   {
			if(i<j) {
				
				
				temp= a[i];
				a[i]=a[j];
				a[j]=temp;
				
				
			}else {
				
				
				System.out.println("I will not do anything for the string beyond my reach");
			}
			
			
	j--;
		}
		
		
		return a;
		
		
		
		
	}
	
	public void printString(String[] y) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<y.length;i++) {
			
			System.out.println("printing string values: "+y[i]);
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Hello World Success Data I am a developer";
		
		
		ReverseStringWordsTest rev= new ReverseStringWordsTest();
		
		String []y=rev.reverseStringWords(s);
		rev.printString(y);

	}

// we have to do space vala logic as well 
	

}
