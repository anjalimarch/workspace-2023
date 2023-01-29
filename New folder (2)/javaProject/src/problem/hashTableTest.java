package problem;

import java.util.HashMap;
import java.util.Hashtable;

public class hashTableTest {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht= new Hashtable<Integer, String>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		 ht.put(1, "20");
		
		 ht.put(1, "89");
		
		 ht.put(2, "89");
		 
		 hm.put(2, "30");
		 
		 hm.put(1, "30");
		 hm.put(1, "89");
		 
		 System.out.println("hm"+hm+"ht"+ht);
		 hm.get(1);
		 ht.get(1);
		 
	}

}
