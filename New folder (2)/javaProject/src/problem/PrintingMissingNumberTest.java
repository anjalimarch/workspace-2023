package problem;

public class PrintingMissingNumberTest {


	
	//int [] a= {1,2,3,4,5,6,...,99};
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= new int[99];
		int i,sum=0;
		int sumOfGiven,n=99, missingNumber;
		
		for(i=0;i<a.length;i++) {
			
			
			  if(i==5) {
				  continue;
				  
			  }
			a[i]=i+1;
			sum = sum +a[i];
			
			   System.out.println("adding sum of the array  "+ a[i]+"--"+sum);	
			
		}
		
		sumOfGiven= n*n/2+n/2;
		
		
		System.out.println("sumofGiven:"+sumOfGiven);
		
		missingNumber= sumOfGiven-sum;
		
		System.out.println("missing number:"+missingNumber);
	  
	}

}
