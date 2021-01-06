import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;


public class ex59 {


	public static void main (String[] args) {
	
	loopFunction();
		
/*	
	aboveTest();
	belowTest();
	betweenTest();
*/
	}


	public static void loopFunction () {
		Scanner input = new Scanner(System.in); 

		int number;

		do {	
			System.out.print("Enter a number between 1 and 10:");			
			number = input.nextInt(); 		 

		} while (number > 10 || number < 1);

	
		if (number < 10 && number > 1) 
			System.out.println(number + " is between 1 and 10. Thanks!"); 
	}
/*	
	public static void aboveTest () {
	assertEquals(loopFunction(15), " is not between 1 and 10");
	}

	public static void belowTest () {
	assertEquals(loopFunction(-5), " is not between 1 and 10");
	}

	public static void betweenTest () {
	assertEquals(loopFunction(5), " is between 1 and 10. Thanks!");
	}
*/
}

