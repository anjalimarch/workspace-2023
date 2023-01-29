package InterviewQuestions;

public class arrayDescendingOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,c=0,temp;
		int [] a= {99,199,7,299,300,121,8};
         for(i=0;i<a.length;i++) {
			
			System.out.println("arrays without sorting:"+a[i]);
			
			
		}
		
		for(i=0;i<a.length;i++) {
			
			System.out.println("array to be printed :"+ a[i]);
			
			for(j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					
					a[i]=a[j];
					a[j]=temp;
					
					
					
				}
				
			}
		}
		
		
		for(i=0;i<a.length;i++) {
			
			System.out.println("arrays in descending order:"+a[i]);
			
			
		}
		
		
	}

}
