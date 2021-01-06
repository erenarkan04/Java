import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;


public class ex58 {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in); 

		int x = input.nextInt(); 

		System.out.println(luckyFunction(x)); 

	 	assertLuckyTest ();	
		assertUnluckyTest ();

	}


	public static String luckyFunction (int n) {
		
		String output; 		

		if ((n < 999)) {
			output = "not 4 digits";
		}
		else {
	


		int index1 = (n % 10); 
		int index2 = (n / 10) % 10; 
		int index3 = (n / 100) % 10;
		int index4 = (n / 1000) % 10;

		if (index1 + index2 == index3 + index4)
			output = "Lucky"; 

		else output = "Unlucky"; 


		} 
		
		return output;
	}

			
 
	
	public static void assertLuckyTest () {

		assertEquals(luckyFunction(2341), "Lucky"); 

	}

	public static void assertUnluckyTest () {

		assertEquals(luckyFunction(2342), "Unlucky"); 

	}


}
