package problem;

public class ReverseArrayInGroupTest {

	int i = 0, k, temp;

	public int[] reverseArrayinGroup(int[] a, int n) {
		// TODO Auto-generated method stub

		for (i = 0; i < a.length; i = i + n) {

			k = i + n - 1;//8, l-1=7

			if (k <= a.length - 1) {
				  temp = a[k];
			     a[k] = a[i];
			     a[i] = temp;

		     }else if(k==a.length) {
		    	 k--;
		    	 temp = a[k];
			     a[k] = a[i];
			     a[i] = temp;
		    	 
		     }
			
		
		}

		return a;
	}

	public void printArray(int[] b) {
		// TODO Auto-generated method stub
		for (i = 0; i < b.length; i++) {

			System.out.println("b[i]--" + b[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 3;
		ReverseArrayInGroupTest r = new ReverseArrayInGroupTest();
		int[] b = r.reverseArrayinGroup(a, n);

		r.printArray(b);
	}

}
