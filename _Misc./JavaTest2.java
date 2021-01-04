import junit.framework.*;
//import junit.framework.TestCase;


public class JavaTest2 extends TestCase {
	
 		public static void main(String[] args) {
    	
		if (testKaan()) {		

			System.out.print(returnNameAndNumbers("Kaan")); 
			System.out.print("\n"); 
			System.out.print("Works"); 
			System.out.print("\n"); 
		}	

		else System.out.println("ERROR");

			
 		}
		

		public static String returnNameAndNumbers(String name) {
			return name + name.length(); 

		
		

		}


		public static boolean testKaan() {
			
			assertEquals(returnNameAndNumbers("Kaan"), "Kaan4"); 
			
			return true; 


		}

			
}










