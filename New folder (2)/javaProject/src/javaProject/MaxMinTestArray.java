package javaProject;

public class MaxMinTestArray {
	
	
	public static void main(String args[]) {
		
		int [] array= {67,89,34,56,200,2002,2004,20005,89};
		
		findMaxandMinArray(array);
		
	}
	public static void findMaxandMinArray(int a[]) {
		// TODO Auto-generated method stub
		
		int min = a[0];
		int max = a[1];
		
		if(min>max) {
			int temp= min;
			min=max;
			max=temp;
		}
		
		for(int i=2; i<a.length;i++){
			
			if(a[i]>max) {
				max= a[i];
				
			}else if(a[i]<min){
				min = a[i];
				
			}
				
			
			
		}
		System.out.println("min--"+min +"max--"+max);	
		
		
	}

}
