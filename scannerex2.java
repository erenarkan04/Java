import java.util.Scanner;
import junit.framework.*; 

public class scannerex2 {

	public static void main (String[] args) {
 
	
		Scanner input = new Scanner(System.in); 


		System.out.print("Enter your name and age :"); 
		
		String name = input.next();		
		int age = input.nextInt(); 
		

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




