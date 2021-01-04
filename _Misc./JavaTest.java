import junit.framework.*;
//import junit.framework.TestCase;


public class JavaTest extends TestCase {
	
 		public static void main(String[] args) {
    	
		testCaseOne(); 
 	}
		

		public static void testCaseOne() {
				assertEquals(square(1),2);

		}


		public static int square (int number) {
			return number * number; 
		}
		
	
	
		
}










