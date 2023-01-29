package javaProject;

import java.util.HashMap;

public class charsRepeatOfStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AnjaliMishra";
         countOfTheCharsInString(s);
	}

	public static void countOfTheCharsInString(String s) {
		// TODO Auto-generated method stub
		char [] newString= s.toCharArray();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(char a:newString) {
			
			if(hmap.containsKey(a)) {
			hmap.put(a,hmap.get(a)+1);				
				
			}else {
				
				hmap.put(a, 1);
				
			}
			
		}
		
		
		System.out.println("values of the keys--"+hmap);
		
	}

}
