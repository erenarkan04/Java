import junit.framework.*;
//import junit.framework.TestCase;


public class Main extends TestCase {
	
 		
		//static String name = new Me.sayName(); 
		//static String age = new Me.sayAge();


		public static void main(String[] args) {
    	
		System.out.println(Me.sayName()); 
		System.out.println(Me.sayAge());
		
		errorCheck(); 

		}
		


		
	
		

		public static boolean errorCheck() {
			
			assertEquals(Me.sayName(), "Earen Arkan"); 

			return true; 

			
		}


}












