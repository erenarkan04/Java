import org.junit.*;
import static org.junit.Assert.*;

public class Main2 {

	public static void main (String[] args) {
		System.out.println(Me2.sayName());
		System.out.println(Me2.sayAge());
	
	errorCheck(); 

	}

	@Test
	public static boolean errorCheck () {
	assertEquals(Me2.sayName(), "ErenArkan");
	return true; 
	}
	
}



