package javaProject;

public class kthsmallestQuickselectTest {
	
	public static int  quickSelect(int a[], int lo, int hi, int k) {
		int pivot = a[hi];
		int pi =partioning(a, pivot, lo, hi);
		if(k>pi) {
			return quickSelect(a, pi+1, hi, k);
			
		}else if(k<pi) {
			return quickSelect(a, lo,pi-1, k );
			
		}else if (k==pi) {
			
			
			return a[pi];
		}
		
		return (Integer) null;
	}

	
	
	public static int  partioning(int []a, int pivot , int lo, int hi) {
		int i = lo, j= lo;
		
	while(i<=hi) {
		if(a[i]<=pivot) {
			swap(a,i,j);
			i++;
			j++;
		}else {
			
			i++;
		}
		
		
		
	}
	
	return (j-1);
	}

	public  static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a = {7,9,4,8,3,6,2,1};

int k=3;
System.out.println(quickSelect(a,0, a.length-1,k-1));

	}

}
