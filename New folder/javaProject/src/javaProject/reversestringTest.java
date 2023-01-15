package javaProject;

public class reversestringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s= "Anjali Mishra";

       reverseString(s);
	}

	public  static void reverseString(String s) {
		// TODO Auto-generated method stub
		int j= s.length()-1;
		char temp;
		char [] a=s.toCharArray();
		
		for(int i = 0; i<j;i++) {
			
			if(i>=j)
			{
				
				return;
			}
			
			temp= a[i];
			a[i]=a[j];
			a[j]=temp;			
			j--;
		}
		System.out.println("a[i]:"+String.valueOf(a));
		
		
		
	}

	
	
	
}
