import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;


public class ex59 {


	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in); 

		
		int number = input.nextInt(); 

		while (number > 10 || number < 1) {
			System.out.print("is not between 1 and 10"); 
			number = input.nextInt();
		}

	
		if (number < 10 && number > 1) 
			System.out.println("is between 1 and 10. Thanks!"); 
/*	
	aboveTest();
	belowTest();
	betweenTest();
*/
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

