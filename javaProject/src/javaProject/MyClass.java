package javaProject;

import java.util.HashMap;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am Anjali Mishra Anjali Mishra Mishra and minding my own business";
          repeatedWords(s);
          
	}
	
	
	
	public static void repeatedWords(String s) {
		String [] names = s.split(" ");
		HashMap<String, Integer> values = new HashMap<String, Integer>();
		int i = 1;
		
		for(String var: names){
			
			
			if(values.containsKey(var)) {
				
				values.put(var, values.get(var)+1);
				
			}else {
				
				values.put(var,i);
			}
			

			if(values.get(var)>1) {
			//System.out.println(var+"--"+values.get(var));
				
				
			}
			
		
		}
		
		
		System.out.println(values);
	}

}
