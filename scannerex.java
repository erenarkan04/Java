import java.util.Scanner;
import junit.framework.*; 

public class scannerex {

	public static void main (String[] args) {
 
	
		Scanner ageInput = new Scanner(System.in); 
		Scanner nameInput = new Scanner(System.in);

		System.out.print("Enter your name and age :"); 
		
		String name = nameInput.next();		
		int age = ageInput.nextInt(); 
		

		System.out.println(name + " ! You are " + age + " years old!"); 


//		nameCheck(); 
//		ageCheck(); 


	}

		

//		public static boolean nameCheck () {
//			if(assertEquals(name.getClass(), String.class))
//			return true; 
//		}
//
//		public static boolean ageCheck () {
//			if(assertEquals(age.getClass(), int.class))
//			return true; 
//		}




}




