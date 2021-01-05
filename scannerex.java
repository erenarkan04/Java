import java.util.Scanner;
import junit.framework.*;
//import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;

public class scannerex {

	public static void main (String[] args) {
 
	
		Scanner ageInput = new Scanner(System.in); 
		Scanner nameInput = new Scanner(System.in);

		System.out.print("Enter your name and age :"); 
		
		String name = nameInput.next();		
//		int age = ageInput.nextInt(); 
		int age = "abc"; 
		String result = name + " ! You are " + age + " years old!";
		
		System.out.println(result); 
		


		nameCheck(name); 
		ageCheck(age); 


	}


		

	
	
		public static void nameCheck (String namevar) {
			assertEquals(namevar.getClass().getName(), "java.lang.String"); 
			 
		}
		
		public static void ageCheck (int agevar) {
			assertTrue("bla", agevar == (int) agevar);
			 
		}
	



}



