package problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFromFileTest {
	


	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File f= new File("C:\\Users\\anjalmishra\\Documents\\2023\\passwords.txt");
		Scanner s= new Scanner(f);
		
		while(s.hasNextLine()) {
			
			System.out.println(s.nextLine());
			
			
		}

	}

}
